
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


