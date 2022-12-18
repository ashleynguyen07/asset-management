

fetch("http://localhost:8080/asset").then((asset_data) => {
    console.log(asset_data);
    return asset_data.json(); //converted to object
}).then((data) => {
    console.log(data);
    let tableData = "";
    data.map((values) => {
        tableData += `
    <tr>
        <td>${values.assetID}</td>
        <td>${values.name}</td>
        <td>${values.color}</td>
        <td>${values.price}</td>
        <td>${values.weight}</td>
        <td>${values.quatity}</td>
    </tr>`;
    });
    document.getElementById("asset-table-body").innerHTML = tableData;
 })