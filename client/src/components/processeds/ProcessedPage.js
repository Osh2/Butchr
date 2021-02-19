import ProcessedList from "./ProcessedList";

const ProcessedPage = function({processedData}){
console.log(processedData)
    return (
        <>
        <ProcessedList processedData = {processedData} />
        </>
    )
}

export default ProcessedPage;