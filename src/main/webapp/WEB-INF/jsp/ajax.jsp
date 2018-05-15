
<html>
<head>
    <title>Spring MVC AJAX Example</title>
    <link href="resources/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.2.3.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $('.ajax-button').click(function() {
                $.ajax({
                    url: 'ajaxquery',
                    data: ({name : 'sam'}),
                    success: function(data) {console.log(data);
                        $('#response').html(data);
                    }
                });
            });
        });
    </script>
    </div>
</head>
<body>
<div>
    <p  style="text-align: center; margin: 40px 0;">
        <a class="ajax-button makble_button_large_green">Send Ajax request</a></p>
</div>
<div id="textbox-style">
    <div id="response" style="text-align:center">
    </div>
</div>
</body>
</html>
 