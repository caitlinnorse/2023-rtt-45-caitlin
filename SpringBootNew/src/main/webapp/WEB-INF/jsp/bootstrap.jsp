 <jsp:include page="include/header.jsp" />

 <link rel="stylesheet" href="/pub/css/global.css">
 <h1 id="firsth1" class="page-header" border: 1px solid;
    >This is a page title</h1>
    <h2 class="page-header" style="background-color: azure; display: none;">This is another page title</h2>
    <h1 class="page-header">This is a second h1</h1>

    <br>
    <p><a href="/bootstrap.html">This is visited</a></p>
    <p><a href="/asdf">This is not visited</a></p>
    <br>

    <div class="absolute-example">Div Box</div>

    <div class="container" style="padding-top: 30px">
    <table class="table table-striped table-hover table-success">
    <thead>
      <tr>
        <th scope="col">#</th>
        <th scope="col">First</th>
        <th scope="col">Last</th>
        <th scope="col">Handle</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
      </tr>
      <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fat</td>
      </tr>
      <tr>
        <th scope="row">3</th>
        <td colspan="2">Larry the Bird</td>
        <td>@twitter</td>
      </tr>
    </tbody>
  </table>

  <button type="button" class="btn btn-primary btn-sm">Save</button>
  <button type="button" class="btn btn-secondary btn-sm">Cancel</button>
</div>
<jsp:include page="include/footer.jsp" />