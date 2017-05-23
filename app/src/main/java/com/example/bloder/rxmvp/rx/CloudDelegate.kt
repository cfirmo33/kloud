package com.example.bloder.rxmvp.rx

import com.example.bloder.rxmvp.FoodApplication
import kotlin.reflect.KProperty

/**
 * Created by bloder on 21/05/17.
 */
class CloudDelegate {

    operator fun getValue(thisRef: Any?, property: KProperty<*>) : Cloud = FoodApplication.provide().rxFood
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Cloud) {}
}