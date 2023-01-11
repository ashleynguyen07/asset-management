
// FETCH EMPLOYEE LIST

fetch("http://localhost:8080/employees").then((data) => {
    console.log(data);
    return data.json(); //converted to object
}).then((objectData) => {
    console.log(objectData);
    let tableData = "";
    objectData.map((values) => {
        tableData += `
    <tr>
        <td>${values.employID}</td>
        <td>${values.name}</td>
        <td>${values.birthdate}</td>
        <td>${values.role}</td>
        <td>${values.sex}</td>
        <td>${values.password}</td>
    </tr>`;
    });
    document.getElementById("table-body").innerHTML = tableData;
})



document.getElementById("request-data").onclick = function () {
    fetch("http://localhost:8080/employees", {
     
    // Adding method type
    method: "POST",
     
    // Adding body or contents to send
    body: JSON.stringify({
        // employeeID: employID,
        // password: password,

    }),
     
    // Adding headers to the request
    headers: {
        "Content-type": "application/json; charset=UTF-8"
    }
}).then((data) => {
        console.log(data);
        return data.json(); //converted to object
    }).then((objectData) => {
        console.log(objectData);
    //     let tableData = "";
    //     objectData.map((values) => {
    //         tableData += `
    // <tr>
    //     <td>${values.employID}</td>
    //     <td>${values.name}</td>
    //     <td>${values.birthdate}</td>
    //     <td>${values.role}</td>
    //     <td>${values.sex}</td>
    //     <td>${values.password}</td>
    // </tr>`;
    //     });

    })

};



