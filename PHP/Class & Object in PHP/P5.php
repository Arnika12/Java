<!-- Write a PHP program to create a class temperature which contains data members as
Celsius and Fahrenheit . Create and Initialize all values of temperature object by using
parameterized constructor . Convert Celsius to Fahrenheit and Convert Fahrenheit to Celsius
using member functions. Display conversion on next page.-->

<?php

class Temperature {
    private $celsius;
    private $fahrenheit;

    // Parameterized constructor to initialize Celsius and Fahrenheit
    public function __construct($celsius) {
        $this->celsius = $celsius;
        $this->convertCelsiusToFahrenheit();
    }

    // Member function to convert Celsius to Fahrenheit
    private function convertCelsiusToFahrenheit() {
        $this->fahrenheit = ($this->celsius * 9/5) + 32;
    }

    // Member function to convert Fahrenheit to Celsius
    private function convertFahrenheitToCelsius() {
        $this->celsius = ($this->fahrenheit - 32) * 5/9;
    }

    // Display conversion on the next page
    public function displayConversion() {
        echo "<h2>Temperature Conversion</h2>";
        echo "<p>Celsius: $this->celsius &deg;C</p>";
        echo "<p>Fahrenheit: $this->fahrenheit &deg;F</p>";
    }
}

// Example usage
$celsiusTemperature = 25; // You can change this value as per your requirement
$temperatureObj = new Temperature($celsiusTemperature);
$temperatureObj->displayConversion();

?>
