<jsp:include page="includes/header.jsp"/>
        </div>
    </section>

    <h1 style="text-align: center;">Upcoming Events</h1>
    <section>
        <div id='calendar'></div>
        <script>

            document.addEventListener('DOMContentLoaded', function () {
                var calendarEl = document.getElementById('calendar');
                var calendar = new FullCalendar.Calendar(calendarEl, {
                    initialView: 'dayGridMonth',
                    initialDate: '2023-03-27',
                    events: [
                        {
                            start: '2023-02-17',
                            end: '2023-02-20',
                            display: 'background',
                            title: "THON"

                        },
                        {
                            start: '2022-10-15',
                            end: '2022-10-15',
                            display: 'background',
                            title: "Blue Band 5K"

                        },
                        {
                            start: '2022-11-07',
                            end: '2022-11-07',
                            display: 'background',
                            title: "Penn State Basketball VS Winthrop"

                        },
                        {
                            start: '2022-11-10',
                            end: '2022-11-10',
                            display: 'background',
                            title: "Penn State Basketball VS Loyola Maryland"

                        },
                        {
                            start: '2022-11-14',
                            end: '2022-11-14',
                            display: 'background',
                            title: "Penn State Basketball VS Butler"

                        },
                        {
                            start: '2022-11-17',
                            end: '2022-11-17',
                            display: 'background',
                            title: "Penn State Basketball VS Furman"

                        },
                        {
                            start: '2022-11-18',
                            end: '2022-11-18',
                            display: 'background',
                            title: "Penn State Basketball VS Virginia Tech"

                        },
                        {
                            start: '2022-11-20',
                            end: '2022-11-20',
                            display: 'background',
                            title: "Penn State Basketball VS Colorado State"

                        },
                        {
                            start: '2022-11-25',
                            end: '2022-11-25',
                            display: 'background',
                            title: "Penn State Basketball VS Lafayette"

                        },
                        {
                            start: '2022-11-29',
                            end: '2022-11-29',
                            display: 'background',
                            title: "Penn State Basketball VS Clemson"

                        },
                        {
                            start: '2022-12-07',
                            end: '2022-12-07',
                            display: 'background',
                            title: "Penn State Basketball VS Michigan State"

                        },
                        {
                            start: '2022-12-10',
                            end: '2022-12-10',
                            display: 'background',
                            title: "Penn State Basketball VS Illinois"

                        },
                        {
                            start: '2022-12-18',
                            end: '2022-12-18',
                            display: 'background',
                            title: "Penn State Basketball VS Canisius"

                        },
                        {
                            start: '2022-12-22',
                            end: '2022-12-22',
                            display: 'background',
                            title: "Penn State Basketball VS Quinnipiac"

                        },
                        {
                            start: '2023-01-01',
                            end: '2023-01-01',
                            display: 'background',
                            title: "Penn State Basketball VS Iowa"

                        },
                        {
                            start: '2023-01-04',
                            end: '2023-01-04',
                            display: 'background',
                            title: "Penn State Basketball VS Michigan"

                        },
                        {
                            start: '2023-01-08',
                            end: '2023-01-08',
                            display: 'background',
                            title: "Penn State Basketball VS Purdue"

                        },
                        {
                            start: '2023-01-11',
                            end: '2023-01-11',
                            display: 'background',
                            title: "Penn State Basketball VS Indiana"

                        },
                        {
                            start: '2023-01-17',
                            end: '2023-01-17',
                            display: 'background',
                            title: "Penn State Basketball VS Wisconsin"

                        },
                        {
                            start: '2023-01-21',
                            end: '2023-01-21',
                            display: 'background',
                            title: "Penn State Basketball VS Nebraska"

                        },
                        {
                            start: '2023-01-24',
                            end: '2023-01-24',
                            display: 'background',
                            title: "Penn State Basketball VS Rutgers"

                        },
                        {
                            start: '2023-01-29',
                            end: '2023-01-29',
                            display: 'background',
                            title: "Penn State Basketball VS Michigan (THON Game)"

                        },
                        {
                            start: '2023-02-01',
                            end: '2023-02-01',
                            display: 'background',
                            title: "Penn State Basketball VS Purdue"

                        },
                        {
                            start: '2023-02-05',
                            end: '2023-02-05',
                            display: 'background',
                            title: "Penn State Basketball VS Nebraska"

                        },
                        {
                            start: '2023-02-08',
                            end: '2023-02-08',
                            display: 'background',
                            title: "Penn State Basketball VS Wisconsin"

                        },
                        {
                            start: '2023-02-11',
                            end: '2023-02-11',
                            display: 'background',
                            title: "Penn State Basketball VS Maryland"

                        },
                        {
                            start: '2023-02-14',
                            end: '2023-02-14',
                            display: 'background',
                            title: "Penn State Basketball VS Illinois"

                        },
                        {
                            start: '2023-02-18',
                            end: '2023-02-18',
                            display: 'background',
                            title: "Penn State Basketball VS Minnesota"

                        },
                        {
                            start: '2023-02-23',
                            end: '2023-02-23',
                            display: 'background',
                            title: "Penn State Basketball VS Ohio State"

                        },
                        {
                            start: '2023-02-26',
                            end: '2023-02-26',
                            display: 'background',
                            title: "Penn State Basketball VS Rutgers"

                        },
                        {
                            start: '2023-03-01',
                            end: '2023-03-01',
                            display: 'background',
                            title: "Penn State Basketball VS Northwestern"

                        },
                        {
                            start: '2023-03-05',
                            end: '2023-03-05',
                            display: 'background',
                            title: "Penn State Basketball VS Maryland"

                        },
                        {
                            start: '2023-03-09',
                            end: '2023-03-09',
                            display: 'background',
                            title: "Penn State Basketball VS Illinois BIG TEN TOURNAMENT"

                        },
                        {
                            start: '2023-03-10',
                            end: '2023-03-10',
                            display: 'background',
                            title: "Penn State Basketball Northwestern BIG TEN TOURNAMENT"

                        },
                        {
                            start: '2023-03-11',
                            end: '2023-03-11',
                            display: 'background',
                            title: "Penn State Basketball VS Indiana BIG TEN TOURNAMENT"

                        },
                        {
                            start: '2023-03-12',
                            end: '2023-03-12',
                            display: 'background',
                            title: "Penn State Basketball VS Purdue BIG TEN TOURNAMENT"

                        },
                        {
                            start: '2023-03-16',
                            end: '2023-03-16',
                            display: 'background',
                            title: "Penn State Basketball VS Texas A&M NCAA TOURNAMENT"

                        },
                        {
                            start: '2023-03-18',
                            end: '2023-03-18',
                            display: 'background',
                            title: "Penn State Basketball VS Texas NCAA TOURNAMENT"

                        },
                        {
                            start: '2023-09-02',
                            end: '2023-09-02',
                            display: 'background',
                            title: "Penn State Football VS West Virginia"

                        },
                        {
                            start: '2023-09-09',
                            end: '2023-09-09',
                            display: 'background',
                            title: "Penn State Football VS Delaware"

                        },
                        {
                            start: '2023-09-16',
                            end: '2023-09-16',
                            display: 'background',
                            title: "Penn State Football VS Illinois"

                        },
                        {
                            start: '2023-09-23',
                            end: '2023-09-23',
                            display: 'background',
                            title: "Penn State Football VS Iowa"

                        },
                        {
                            start: '2023-09-30',
                            end: '2023-09-30',
                            display: 'background',
                            title: "Penn State Football VS Northwestern"

                        },
                        {
                            start: '2023-10-14',
                            end: '2023-10-14',
                            display: 'background',
                            title: "Penn State Football VS UMass"

                        },
                        {
                            start: '2023-10-21',
                            end: '2023-10-21',
                            display: 'background',
                            title: "Penn State Football VS Ohio State"

                        },
                        {
                            start: '2023-10-28',
                            end: '2023-10-28',
                            display: 'background',
                            title: "Penn State Football VS Indiana"

                        },
                        {
                            start: '2023-11-04',
                            end: '2023-11-04',
                            display: 'background',
                            title: "Penn State Football VS Maryland"

                        },
                        {
                            start: '2023-11-11',
                            end: '2023-11-11',
                            display: 'background',
                            title: "Penn State Football VS Michigan"

                        },
                        {
                            start: '2023-11-18',
                            end: '2023-11-18',
                            display: 'background',
                            title: "Penn State Football VS Rutgers"

                        },
                        {
                            start: '2023-11-25',
                            end: '2023-11-25',
                            display: 'background',
                            title: "Penn State Football VS Michigan State"

                        },
                    ],
                });
                calendar.render();
            });

        </script>
    </section>
<jsp:include page="includes/footer.jsp"/>