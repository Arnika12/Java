# 5. Write a PHP script to check how many times the web page access.[ Use cookies]

<html>
<head>
    <title>Count Number of Visits on a web page using cookies</title>
</head>
<body>

    <h3>Write a PHP Program to Count Number of Visits on a web page using cookies in php</h3>

    <?php
        $countvisit = 1;

        if(isset($_COOKIE['countvisit']))
        {
            $countvisit = $_COOKIE['countvisit'];
            $countvisit ++; 
        }
        setcookie('countvisit', $countvisit);       
        echo "You have visited ".$countvisit." times";
    ?>
    
</body>
</html>
