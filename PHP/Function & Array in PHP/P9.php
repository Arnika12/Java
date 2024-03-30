<?php
                $str = $_GET['str'];
                $op = $_GET['op'];
                $stack = array("orange", "banana", "apple", "raspberry");
                switch($op)
                {
                                case 1 : echo "string is :: $str<br>";
                                                  array_push($stack,"$str");
                                                  var_dump($stack);
                                                  break;
                                case 2 : $last_elt = array_pop($stack);
                                                var_dump($stack);
                                                var_dump('deleted element is :'.$last_elt);
                                                break;
                                case 3 : var_dump($stack);
                                                break;
                }
?>