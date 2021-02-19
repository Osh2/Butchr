import NonFoodList from "../nonFoodItems/NonFoodList";

const NonFoodPage = ({nonFoodData}) => {
     return (
         <>
            <NonFoodList nonFoodData={nonFoodData} />
         </>
     )
}

export default NonFoodPage;