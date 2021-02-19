import {Link} from "react-router-dom";
const MeatCard = function({ meat, setIndividualMeat}) {


    const getMeatDetails = () => {
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
            <Link to="/meatdetails"><button onClick={getMeatDetails}>Details</button></Link>
        </>
    )
}

export default MeatCard;