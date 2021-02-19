const MeatCard = function({ meat, setIndividualMeat}) {


    const getMeatDetails = (id) => {
        fetch("http://localhost:8080/items/item/" + meat.id)
        .then(res => res.json())
        .then(returnedData => setIndividualMeat(returnedData))
    }

    return(
        <>
            <h4>{meat.name}</h4>
            <h5>{meat.type}</h5>
            <h5>{meat.description}</h5>
            <h5>£{meat.price}</h5>
            <h5>{meat.cut}</h5>
            <button onClick={getMeatDetails}>Details</button>
        </>
    )
}

export default MeatCard;