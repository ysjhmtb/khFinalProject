<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>button settings</title>
	
	
	
	  <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
	  <script src="https://apis.google.com/js/api:client.js"></script>
	  
	  
	  <script>
	  var googleUser = {};
	  var startApp = function() {
	    gapi.load('auth2', function(){
	      // Retrieve the singleton for the GoogleAuth library and set up the client.
	      auth2 = gapi.auth2.init({
	        client_id: '906384191970-n96eii1dt986cgrh7krom313i4us4kab.apps.googleusercontent.com',
	        cookiepolicy: 'single_host_origin',
	        // Request scopes in addition to 'profile' and 'email'
	        //scope: 'additional_scope'
	      });
	      attachSignin(document.getElementById('customBtn'));
	    });
	  };
	
	  function attachSignin(element) {
	    console.log(element.id);
	    auth2.attachClickHandler(element, {},
	        function(googleUser) {
	    	
	    	 // Useful data for your client-side scripts:
	        var profile = googleUser.getBasicProfile();
	        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
	        console.log('Full Name: ' + profile.getName());
	        console.log('Given Name: ' + profile.getGivenName());
	        console.log('Family Name: ' + profile.getFamilyName());
	        console.log("Image URL: " + profile.getImageUrl());
	        console.log("Email: " + profile.getEmail());
	
	        // The ID token you need to pass to your backend:
	        var id_token = googleUser.getAuthResponse().id_token;
	        console.log("ID Token: " + id_token);
	    	
	          document.getElementById('name').innerText = "Signed in: " +
	              googleUser.getBasicProfile().getName();
	        }, function(error) {
	          alert(JSON.stringify(error, undefined, 2));
	        });
	  }
	  
	  
	  
	
	  </script>
	  
	  
	  <style type="text/css">
	    #customBtn {
	      display: inline-block;
	      background: white;
	      color: #444;
	      width: 190px;
	      border-radius: 5px;
	      border: thin solid #888;
	      box-shadow: 1px 1px 1px grey;
	      white-space: nowrap;
	    }
	    #customBtn:hover {
	      cursor: pointer;
	    }
	    span.label {
	      font-family: serif;
	      font-weight: normal;
	    }
	    span.icon {
	      background: url('/googleLogin/resources/images/sign-in/g-normal.png') transparent 5px 50% no-repeat;
	      display: inline-block;
	      vertical-align: middle;
	      width: 42px;
	      height: 42px;
	    }
	    span.buttonText {
	      display: inline-block;
	      vertical-align: middle;
	      padding-left: 42px;
	      padding-right: 42px;
	      font-size: 14px;
	      font-weight: bold;
	      /* Use the Roboto font that is loaded in the <head> */
	      font-family: 'Roboto', sans-serif;
	    }
	  </style>
  


   <!--  <meta name="google-signin-client_id" content="906384191970-n96eii1dt986cgrh7krom313i4us4kab.apps.googleusercontent.com"> -->

</head>
<body>


	<!-- In the callback, you would hide the gSignInWrapper element on a
  successful sign in -->
  <div id="gSignInWrapper" >
    <span class="label">Sign in with:</span>
    <div id="customBtn" class="customGPlusSignIn">
      <span class="icon"></span>
      <span class="buttonText">Google</span>
    </div>
  </div>
  <div id="name"></div>
  <script>startApp();</script>



	
	<!-- <div id="my-signin2"></div>
	<script>
	    function onSuccess(googleUser) {
	        console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
	    }
	    function onFailure(error) {
	        console.log(error);
	    }
	    function renderButton() {
	        gapi.signin2.render('my-signin2', {
	            'scope': 'profile email',
	            'width': 240,
	            'height': 50,
	            'longtitle': true,
	            'theme': 'dark',
	            'onsuccess': onSuccess,
	            'onfailure': onFailure
	        });
	    }
	</script>
	
	<script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script> -->
	

</body>
</html>