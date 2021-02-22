import ProcessedCard from "./ProcessedCard";
import App from "../../App";


const ProcessedList = ({processedData, setIndividualProcessed, user }) => {

    const processedJSX = processedData.map((item) => {
        return (
            <ProcessedCard 
            processed = {item}
            setIndividualProcessed={setIndividualProcessed}
            user={user}
            key = {item.id}/>
        )
    })

    return (
        <div className="itemList">
                {processedJSX}
            </div>
    )
}


export default ProcessedList;