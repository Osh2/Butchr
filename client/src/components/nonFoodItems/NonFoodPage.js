import NonFoodList from "../nonFoodItems/NonFoodList";

const NonFoodPage = ({nonFoodData, setIndivdualNonFoodItem}) => {
     return (
         <>
            <NonFoodList nonFoodData={nonFoodData} setIndivdualNonFoodItem={setIndivdualNonFoodItem}/>
         </>
     )
}

export default NonFoodPage;