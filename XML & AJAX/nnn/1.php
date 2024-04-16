<!DOCTYPE html>
<html>
<head>
    <title>Movie Selection</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#actorSelect").change(function() {
                var actorName = $(this).val();
                $.ajax({
                    url: "getMovies.php", // URL of the PHP file to handle AJAX request
                    type: "GET",
                    data: { actorName: actorName },
                    success: function(data) {
                        $("#movieList").html(data);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <h2>Select an Actor:</h2>
    <select id="actorSelect">
        <option value="">Select Actor</option>
        <?php
            // PHP code to fetch actor names from the database and populate the dropdown
            $servername = "localhost";
            $username = "root";
            $password = "";
            $database = "XML&AJAX";

            $conn = new mysqli($servername, $username, $password, $database);
            if ($conn->connect_error) {
                die("Connection failed: " . $conn->connect_error);
            }

            $sql = "SELECT * FROM Actor";
            $result = $conn->query($sql);
            if ($result->num_rows > 0) {
                while($row = $result->fetch_assoc()) {
                    echo "<option value='" . $row["aname"] . "'>" . $row["aname"] . "</option>";
                }
            }
            $conn->close();
        ?>
    </select>

    <h2>Movies:</h2>
    <div id="movieList"></div>
</body>
</html>
