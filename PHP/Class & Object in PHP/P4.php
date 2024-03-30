<1-- Create a class named DISTANCE with feet and inches as data members. The class has the following
member functions: convert_feet_to_inch() , convert_inch_to_feet() . Display options using radio
button and display conversion on next page. -->

<?php

class Distance {
    private $feet;
    private $inches;

    // Parameterized constructor to initialize feet and inches
    public function __construct($feet, $inches) {
        $this->feet = $feet;
        $this->inches = $inches;
    }

    // Member function to convert feet to inches
    public function convertFeetToInch() {
        return ($this->feet * 12) + $this->inches;
    }

    // Member function to convert inches to feet
    public function convertInchToFeet() {
        $totalInches = $this->feet * 12 + $this->inches;
        $convertedFeet = floor($totalInches / 12);
        $remainingInches = $totalInches % 12;

        return array('feet' => $convertedFeet, 'inches' => $remainingInches);
    }
}

// Check if the form is submitted
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Retrieve form data
    $conversionType = $_POST['conversion_type'];
    $feet = $_POST['feet'];
    $inches = $_POST['inches'];

    // Create Distance object
    $distanceObj = new Distance($feet, $inches);

    // Perform conversion based on the selected option
    if ($conversionType == 'feet_to_inches') {
        $result = $distanceObj->convertFeetToInch();
        $convertedValue = "$feet feet is equal to $result inches.";
    } else {
        $result = $distanceObj->convertInchToFeet();
        $convertedValue = "$feet feet and $inches inches is equal to {$result['feet']} feet and {$result['inches']} inches.";
    }

    // Display the conversion on the next page
    echo "<h2>Distance Conversion Result</h2>";
    echo "<p>$convertedValue</p>";
} else {
    // Display the form with radio buttons for conversion type
    ?>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Distance Conversion</title>
    </head>
    <body>
        <h2>Select Conversion Type</h2>
        <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
            <input type="radio" name="conversion_type" value="feet_to_inches" checked> Convert Feet to Inches
            <br>
            <input type="radio" name="conversion_type" value="inches_to_feet"> Convert Inches to Feet
            <br><br>
            <label for="feet">Enter Feet:</label>
            <input type="number" name="feet" required>
            <br>
            <label for="inches">Enter Inches:</label>
            <input type="number" name="inches" required>
            <br><br>
            <input type="submit" value="Convert">
        </form>
    </body>
    </html>
    <?php
}

?>
