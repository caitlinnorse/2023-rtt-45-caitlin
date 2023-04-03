<jsp:include page="includes/header.jsp"/>
        <h1 style="color: #001E44; text-align: center;">Penn State Football</h1>
        <div class="football-pics" style="text-align: center; margin: 20px;">
            <img
                src="https://dxbhsrqyrr690.cloudfront.net/sidearm.nextgen.sites/gopsusports.com/images/2018/8/29/PSU_Helmet_Ball_14_MS_1912.jpg" />
            <br>
            <img
                src="https://images.sidearmdev.com/crop?url=https%3a%2f%2fdxbhsrqyrr690.cloudfront.net%2fsidearm.nextgen.sites%2fgopsusports.com%2fimages%2f2022%2f8%2f18%2f2022TeamCaptains.jpg&height=797&width=1416&type=jpeg&gravity=smart" />
            <img src="https://d3qvqlc701gzhm.cloudfront.net/thumbs/8a1e363c3fee7d2cb09c9b3b7d33f631bb0af1bdd20d7d6ac306e2cb13058a65-750.jpg" />
        </div>
        <div id="football-paragraph">
            <p style="padding: 20px;">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
            </p>
        </div>

        <h2 style="text-align: center; color: #001E44;">Football Schedule</h2>
        <div>
            <table class="table table-striped" style="text-align: center; margin: 20px; ">
                <thead>
                    <tr>
                        <th scope="col">Team</th>
                        <th scope="col">Location</th>
                        <th scope="col">Date</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">Delaware</th>
                        <td>University Park, PA</td>
                        <td>Sepetember 9, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Illinois</th>
                        <td>Champaign, IL</td>
                        <td>Sepetember 16, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Iowa</th>
                        <td>University Park, PA</td>
                        <td>Sepetember 23, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Northwestern</th>
                        <td>Evanston, IL</td>
                        <td>Sepetember 30, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">UMass</th>
                        <td>Charleston, SC</td>
                        <td>November 18, 2022</td>
                    </tr>
                    <tr>
                        <th scope="row">Colorado State</th>
                        <td>University Park, PA</td>
                        <td>October 14, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Ohio State</th>
                        <td>Columbus, OH</td>
                        <td>October 21, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Indiana</th>
                        <td>University Park, PA</td>
                        <td>October 28, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Maryland</th>
                        <td>College Park, MA</td>
                        <td>November 4, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Michigan</th>
                        <td>University Park, PA</td>
                        <td>November 11, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Rutgers</th>
                        <td>University Park, PA</td>
                        <td>November 18, 2023</td>
                    </tr>
                    <tr>
                        <th scope="row">Michigan</th>
                        <td>East Lansing, MI</td>
                        <td>November 25, 2023</td>
                    </tr>
                </tbody>
            </table>
        </div>
<jsp:include page="includes/footer.jsp"/>
<style>
    h1 {
        font-family: "Libre Baskerville";
        margin: 20px;
        background-color: lightskyblue;
    }

    .football-pics {
        display: flex;
        justify-content: space-around;

    }

    img {
        max-width: 30%;
    }

    #football-paragraph {
        background-color: gray;
        color: white;
        text-align: center;
        margin: 20px;
    }
</style>