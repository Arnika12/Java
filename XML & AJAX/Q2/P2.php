<!-- php
// echo "Links data posted";
// $ele=$_GET['txtTitle'];
// $att=$_GET['publ'];
// $xmltags="<?xml version=1.0?>";
// $xmltags=$xmltags."<Bookstore>";
// $xmltags=$xmltags."<Books>";
// $xmltags=$xmltags."<PHP>";
// $xmltags=$xmltags."<title>";
// $xmltags=$xmltags.$ele;
// $xmltags=$xmltags."</title>";
// $xmltags=$xmltags."<publication>";
// $xmltags=$xmltags.$att;
// $xmltags=$xmltags."</attrib>";
// $xmltags=$xmltags."</PHP>";
// $xmltags=$xmltags."</Books>";
// $xmltags=$xmltags."</Bookstore>";
// if($fp=fopen("books.xml","w"))
// {
// if($wt=fwrite($fp,$xmltags))
// {
// echo "File created";
// }
// else
// echo "Not write";
// }
// else
// echo "Not opened";
?> -->


<?php
if(isset($_GET['txtTitle']) && isset($_GET['publ'])) {
    $ele = $_GET['txtTitle'];
    $att = $_GET['publ'];
    
    $xmltags = "<?xml version='1.0' encoding='ISO-8859-1'?>";
    $xmltags .= "<BookStore>";
    $xmltags .= "<Books>";
    $xmltags .= "<PHP>";
    $xmltags .= "<Title>" . $ele . "</Title>";
    $xmltags .= "<Publication>" . $att . "</Publication>";
    $xmltags .= "</PHP>";
    $xmltags .= "</Books>";
    $xmltags .= "</BookStore>";

    if($fp = fopen("books.xml", "w")) {
        if($wt = fwrite($fp, $xmltags)) {
            echo "File created";
        } else {
            echo "Failed to write to file";
        }
        fclose($fp);
    } else {
        echo "Failed to open file";
    }
}
?>

<html>
<head>
    <title>Create XML</title>
</head>
<body>
    <form action="Assign8Prog2.php" method="get">
        Enter Book Title: <input type="text" name="txtTitle">
        Enter Publication: <input type="text" name="publ">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
