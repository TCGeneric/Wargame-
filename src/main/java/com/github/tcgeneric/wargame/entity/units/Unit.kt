package com.github.tcgeneric.wargame.entity.units

import com.github.tcgeneric.wargame.entity.Entity
import com.github.tcgeneric.wargame.map.Tile
import com.github.tcgeneric.wargame.teams.Team

abstract class Unit:Entity() {
    open var combatRange:Int = 0
    open var combatStrength:Int = 0
    open var moral:Int = 0
    open var amount:Int = 0
    lateinit var parentTeam:Team
    var parentTile:Tile? = null
}