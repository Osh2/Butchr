import NonFoodCard from "../nonFoodItems/NonFoodCard";

const NonFoodList = ({nonFoodData}) => {

    const nonFoodJSX = nonFoodData.map((item) => {
        return (
            <NonFoodCard 
            nonFood = {item}
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