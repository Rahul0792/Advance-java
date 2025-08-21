<html>
<body>
<h2>Welcome To Jsp Technology </h2>
<table>
    <%
    int number = 25;
    for(int i = 1; i <= 10; i++) {
    %>
    <tr>
        <td><%= number * i %></td>
    </tr>
    <% } %>
</table>


</body>
</html>
