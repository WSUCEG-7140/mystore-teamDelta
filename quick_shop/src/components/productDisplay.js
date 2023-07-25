import React, { useEffect, useState } from "react";
import Card from './Card'
import "./../CSS/productsDisplay.css"

export default function productsDisplay({dataFromCard}) {
    const [trendingproductsData, setTendingproductData] = useState([])
    const [comingproductsData, setComingproductData] = useState([])

    const fetchData = async () => {
        const response=await fetch('http://localhost:8080/products/getByStatus?status=TRENDING');
        const json=await response.json();
        setTendingproductData(json)
        const response2=await fetch('http://localhost:8080/products/getByStatus?status=COMMING_SOON');
        const json2=await response2.json();
        setComingproductData(json2)
    }
    
    useEffect(() => {
        fetchData()
      }, [])
    return (
        <div>
            <div class="productDisplayHeaderContainer">
                <h1>Trending products</h1>
            </div>
            <div class="productDisplayContainer">
                {trendingproductsData.slice(0,10).map((d) => (
                    <Card product={d} dataFromCard={dataFromCard}/>
                ))}
                <p className="h4style">See More</p>
            </div>
            <div class="productDisplayHeaderContainer">
                <h1>Coming Soon</h1>
            </div>
            <div class="productDisplayContainer">
                {
                comingproductsData.slice(0,10).map((d) => (
                    <Card dataFromCard={dataFromCard} product={d}/>
                ))}
            </div>
        </div>
    );
}
