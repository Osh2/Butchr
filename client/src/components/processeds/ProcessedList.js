import ProcessedCard from "./ProcessedCard";

const ProcessedList = ({processedData}) => {

    const processedJSX = processedData.map((item) => {
        return (
            <ProcessedCard 
            processed = {item}
            key = {item.id}
            />
        )
    })

    return (
        <>
            {processedJSX}
        </>
    )
}


export default ProcessedList;