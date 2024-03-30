<!-- Write a PHP script to display following information using super global variable.
	a) Client IP Address.
	b) Browser detection/information.
	C) To check whether the page is called from ‘https’ or ‘http’. -->

<?php
    echo "Your IP Address Is : " . $_SERVER['REMOTE_ADDR'] . "<br>";
    echo "Browser Detection / Information : " . $_SERVER['HTTP_USER_AGENT'] . "<br>";
                
?>
