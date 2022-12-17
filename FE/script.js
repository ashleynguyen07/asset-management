


// let data = [
//     {
//         "employID": "E160001",
//         "name": "Nguyen Hong Hiep",
//         "birthdate": "12/06/2000",
//         "role": "EM",
//         "sex": "male",
//         "password": "e10adc3949ba59abbe56e057f20f883e"
//     },
//     {
//         "employID": "E160240",
//         "name": "Tran Dinh Khanh",
//         "birthdate": "15/07/2002",
//         "role": "EM",
//         "sex": "male",
//         "password": "e10adc3949ba59abbe56e057f20f883e"
//     },
//     {
//         "employID": "E140449",
//         "name": "Le Buu Nhan",
//         "birthdate": "10/07/2002",
//         "role": "EM",
//         "sex": "male",
//         "password": "e10adc3949ba59abbe56e057f20f883e"
//     },
//     {
//         "employID": "E160798",
//         "name": "Truong Le Minh",
//         "birthdate": "03/12/2002",
//         "role": "EM",
//         "sex": "male",
//         "password": "e10adc3949ba59abbe56e057f20f883e"
//     },
//     {
//         "employID": "E160052",
//         "name": "Hoa Doan",
//         "birthdate": "05/06/1990",
//         "role": "MA",
//         "sex": "male",
//         "password": "e10adc3949ba59abbe56e057f20f883e"
//     }
// ];

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

