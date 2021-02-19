import NonFoodCard from "../nonFoodItems/NonFoodCard";

const NonFoodList = ({nonFoodData, setIndivdualNonFoodItem}) => {

    const nonFoodJSX = nonFoodData.map((item) => {
        return (
            <NonFoodCard 
            nonFood = {item}
            setIndivdualNonFoodItem={setIndivdualNonFoodItem}
            key = {item.id}
            /> 
        )
    })

    return (
        <>
       {nonFoodJSX}
       </>
    )
}

export default NonFoodList;