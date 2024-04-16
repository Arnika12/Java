<!-- <?php
// $doc = new DOMDocument();
// $doc->load("book.xml");

// $books = $doc->getElementsByTagName("books");

// echo "Books Names:<br>";
// foreach ($books as $book) {
//     $bookName = $book->getElementsByTagName("book_name")->item(0)->textContent;
//     echo $bookName . "<br>";
// }

// echo "<br>Years:<br>";
// foreach ($books as $book) {
//     $year = $book->getElementsByTagName("year")->item(0)->textContent;
//     echo $year . "<br>";
// }
?> -->

<?php
$doc = new DOMDocument();
$doc->load("book.xml");

$books = $doc->getElementsByTagName("books");

echo "<table border='1' style='border-collapse:collapse;'>";
echo "<tr><th>Book No</th><th>Book Name</th><th>Author Name</th><th>Price</th><th>Year</th></tr>";

foreach ($books as $book) {
    $bookNo = $book->getElementsByTagName("book_no")->item(0)->textContent;
    $bookName = $book->getElementsByTagName("book_name")->item(0)->textContent;
    $authorName = $book->getElementsByTagName("author_name")->item(0)->textContent;
    $price = $book->getElementsByTagName("price")->item(0)->textContent;
    $year = $book->getElementsByTagName("year")->item(0)->textContent;

    echo "<tr>";
    echo "<td>$bookNo</td>";
    echo "<td>$bookName</td>";
    echo "<td>$authorName</td>";
    echo "<td>$price</td>";
    echo "<td>$year</td>";
    echo "</tr>";
}

echo "</table>";
?>
