const MeatDetails = ({individualMeat}) => {

    console.log(individualMeat);
    return (
        <div id="meatDetails">
            <h1>{individualMeat.name}</h1>
            <p>{individualMeat.description}</p>
            <p>{individualMeat.cut}</p>
            <p>{individualMeat.type}</p>
            <p>£{individualMeat.price}</p>
        </div>
    )
}

export default MeatDetails;