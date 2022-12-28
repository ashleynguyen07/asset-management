
document.getElementById("btnlogin").onclick = login;

function login() {
    let employeeID = document.getElementById("employeeID").value;
    let password = document.getElementById("password").value;

    fetch("http://localhost:8080/login", {

        // Adding method type
        method: "POST",

        // Adding body or contents to send
        body: JSON.stringify({
            employeeID: employeeID,
            password: password,
        }),

        // Adding headers to the request
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }
    }).then((data) => {
        console.log(data);
        if (data === undefined) {
            return data;
        } else {
            return data.json(); //converted to object
        }
    }).then((objectData) => {
        console.log(objectData);
        if (objectData === undefined) {
            console.log("Login Fail!");
        } else {
            console.log(objectData);
            alert("Login thanhf coong");
            
            window.location.href = "/FE/index.html"
            let tableData = "";
    //         objectData.map((values) => {
    //             tableData += `
    // <tr>
    //     <td>${values.employID}</td>
    //     <td>${values.name}</td>
    //     <td>${values.birthdate}</td>
    //     <td>${values.role}</td>
    //     <td>${values.sex}</td>
    //     <td>${values.password}</td>
    // </tr>`;
    //         });
            // document.getElementById("table-body").innerHTML = tableData;
        }
    }).catch((e) => {
        console.log(e);
    })

    // history.push("/employees");

}




