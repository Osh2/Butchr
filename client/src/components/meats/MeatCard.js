const MeatCard = function({ meat}) {

    return(
        <>
            <h4>{meat.name}</h4>
            <h5>{meat.type}</h5>
            <h5>{meat.description}</h5>
            <h5>£{meat.price}</h5>
            <h5>{meat.cut}</h5>
        </>
    )
}

export default MeatCard;