const NonFoodCard = ({nonFood, setIndivdualNonFoodItem}) => {


    const getNonFoodDetails = () => {
        fetch("http://localhost:8080/items/item/" + nonFood.id)
        .then(res => res.json())
        .then(returnedData => setIndivdualNonFoodItem(returnedData))
    }

    return (
        <>
        <h5>{nonFood.name}</h5>
        <h5>{nonFood.type}</h5>
        <h5>{nonFood.description}</h5>
        <h5>{nonFood.price}</h5>
        <h5>{nonFood.manufacturer}</h5>
        <button onClick={getNonFoodDetails}>Details</button>
        </>
    )
}

export default NonFoodCard;