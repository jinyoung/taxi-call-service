
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import BookingManager from "./components/listers/BookingCards"
import BookingDetail from "./components/listers/BookingDetail"

import DriverManager from "./components/listers/DriverCards"
import DriverDetail from "./components/listers/DriverDetail"

import RideManager from "./components/listers/RideCards"
import RideDetail from "./components/listers/RideDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/bookings',
                name: 'BookingManager',
                component: BookingManager
            },
            {
                path: '/bookings/:id',
                name: 'BookingDetail',
                component: BookingDetail
            },

            {
                path: '/drivers',
                name: 'DriverManager',
                component: DriverManager
            },
            {
                path: '/drivers/:id',
                name: 'DriverDetail',
                component: DriverDetail
            },

            {
                path: '/rides',
                name: 'RideManager',
                component: RideManager
            },
            {
                path: '/rides/:id',
                name: 'RideDetail',
                component: RideDetail
            },



    ]
})
