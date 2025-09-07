let allData = [];

const container = document.getElementById('container');

fetch("data.json")
.then(res => res.json())
.then(data => {
    allData = data;
    display(allData);
})
.catch(err =>
    console.log(err)    
);

function display(allData){

    allData.forEach(element => {
        const card = document.createElement('div');
        card.classList.add("card");

        card.innerHTML = `
            <img src="${element.img}" alt="${element.heading}"/>
            <h2>${element.heading}</h2>
            <p>${element.text}</p> 
        `;
        container.appendChild(card);

    });
}

const search = document.getElementById('searchBar')

search.addEventListener('input', (e)=>{
    searchValue = e.target.value.toLowerCase();

    const filtered = allData.filter(element => {
        return(
            element.heading.toLowerCase().includes(searchValue)||
            element.text.toLowerCase().includes(searchValue)
        )
    })

    container.innerHTML = "";
    display(filtered);
})


