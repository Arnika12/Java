<!--2. Design a HTML form to accept a string. Write a PHP script for the following. 
		a) Write a function to count the total number of Vowels from the script. 
		b) Show the occurrences of each Vowel from the script -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Count and Show Vowels</title>
    <style>
        .container {
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Enter a string</h2>
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
            <input type="text" name="input_string" placeholder="Enter a string">
            <button type="submit">Submit</button>
        </form>

        <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            // Retrieve the input string from the form
            $input_string = $_POST['input_string'];

            // Function to count the total number of vowels
            function countVowels($string) {
                return preg_match_all('/[aeiou]/i', $string, $matches);
            }

            // Function to show the occurrences of each vowel
            function showVowelOccurrences($string) {
                $vowels = ['a', 'e', 'i', 'o', 'u'];
                $occurrences = array_fill_keys($vowels, 0);

                foreach (str_split($string) as $char) {
                    if (in_array(strtolower($char), $vowels)) {
                        $occurrences[strtolower($char)]++;
                    }
                }

                return $occurrences;
            }

            // Call the functions
            $total_vowels = countVowels($input_string);
            $vowel_occurrences = showVowelOccurrences($input_string);

            // Display the results
            echo "<h2>Results:</h2>";
            echo "<p>Total number of vowels: $total_vowels</p>";
            echo "<p>Occurrences of each vowel:</p>";
           echo "<ul style=\"list-style:none;\">";
            foreach ($vowel_occurrences as $vowel => $count) {
                echo "<li>$vowel: $count</li>";
            }
            echo "</ul>";
        }
        ?>
    </div>
</body>
</html>

