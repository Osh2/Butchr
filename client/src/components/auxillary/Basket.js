import {useState} from 'react';
import '../../css/Basket.css'

const Basket = ({user}) => {

    let total = 0

    const [basket, setBasket] = useState([]);

    const basketJSX = user.basket.map((item) => {
   
        const itemIndex = (user.basket.indexOf(item)); 

        const removeFromBasket = () => {
            user.basket.splice(itemIndex, 1) 
            setBasket(user.basket.length)
        } 
        total += item.price

        return (

            <div className="basketItems" key={item.id}>
                <img className="item-image" height="150rem" src={item.image}/>
                <h3 className="name-basket" >{item.name}</h3>
                <h3 className="type-basket">{item.type}</h3>
                <h3 className="price-basket">£{item.price}</h3>
                <button onClick={removeFromBasket} id="remove-button">Remove from Basket</button>
            </div>
        )
    })

    
    const totalRender = () => {
        if(user.basket.length > 0 ){
        return <h1>Subtotal ({user.basket.length} items) £{total.toFixed(2)}</h1>
        }
    }

    return (
        <div className="basket">
            <h1>Shopping basket</h1>
            {basketJSX}
            <hr></hr>
            {totalRender()}
        </div>
    )
}

export default Basket;