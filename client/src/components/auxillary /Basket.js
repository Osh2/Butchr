import {useState} from 'react';

const Basket = ({user}) => {

    let total = 0

    const [basket, setBasket] = useState([]);

    const basketJSX = user.basket.map((item) => {

        const itemIndex = (user.basket.indexOf(item)); 

        const removeFromBasket = () => {
            user.basket.splice(itemIndex, 1) 
            setBasket(user.basket.length)
            console.log(user);
            console.log(basket);
        } 
        total += item.price
       
        return (

            <div className="basketItems">
                <img height="150rem" src={item.image}/>
                <h1>{item.name}</h1>
                <h3>{item.type}</h3>
                <h3>{item.description}</h3>
                <h3>{item.price}</h3>
                <h3>{item.index}</h3>
                <button onClick={removeFromBasket}  >Remove</button>
            </div>
        )
    })

    //added logic so total only renders when there are items in the basket
    const totalRender = () => {
        if(user.basket.length > 0 ){
        return <h1>Total basket = £{total}</h1>
        }
    }

    return (
        <div>
            <h1>This is your basket {user.name} </h1>
            {basketJSX}
            {totalRender()}
        </div>


        //confirm basket, maybe with qr code
    )
}

export default Basket;