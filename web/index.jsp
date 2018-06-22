<%--
  Author: Gurubalan Harikrishnan
  Date: 20-06-2018
  Time: 17:26
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JQueryWebApp</title>
      <script type="text/javascript" src="jQuery-3.3.1.js"></script>
      <script src="jQuery.js"></script>
  </head>
  <body>
  <form method="post" action="Servlet" name="form">
      Firstname: <input type="text" name="fn" id="id-fn" placeholder="Enter name!"/>
      <br/>
      <br/>
      Lastname: <input type="text" name="ln" id="id-ln" placeholder="Enter name!"/>
      <br/>
      <br/>
      Username: <input type="text" name="un" id="id-un" placeholder="Enter name!"/>
      <br/>
      <br/>
      Password: <input type="password" name="pass" id="id-pass" placeholder="Enter name!"/>
      <br/>
      <br/>
      <label class="l1">Address: </label>
      <textarea name="address" id="id-address"></textarea>
      <br/>
      <br/>
      Gender: <select name="gender" id="id-gender">
      <option value="Male">Male</option>
      <option value="Female">Female</option>
  </select>
      <br/>
      <br/>
      <input type="submit" value="Submit!"/>
      <br/>
  </form>
  </body>
</html>
