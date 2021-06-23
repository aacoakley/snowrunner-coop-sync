package data

object PreSessionSave {
    val json =
        """{
    "CompleteSave": {
        "SslValue": {
            "saveTime": {
                "timestamp": "0x0000017a02381df0"
            },
            "objVersion": 6,
            "objectiveStates": {
                "US_02_03_LONG_BRIDGE_RECOVERY_TSK": {
                    "id": "US_02_03_LONG_BRIDGE_RECOVERY_TSK",
                    "isFinished": false,
                    "spentTime": 4288.35205078125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_LONG_BRIDGE_RECOVERY_TSK",
                                        "US_02_03_LONG_BRIDGE_RECOVERY_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_LONG_BRIDGE_RECOVERY_TSK",
                                        "US_02_03_LONG_BRIDGE_RECOVERY_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_CARGO_PORT_OBJ": {
                    "id": "US_01_03_CARGO_PORT_OBJ",
                    "isFinished": true,
                    "spentTime": 63996.484375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_03 || US_01_03_LOST_CARGO_PLATFORM",
                                        "map": "level_us_01_03",
                                        "cached": true,
                                        "zoneLocal": "US_01_03_LOST_CARGO_PLATFORM"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoContainerLargeDrilling",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoContainerLargeDrilling",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_PORT_CARGO"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_OIL_DELIVERY_OBJ": {
                    "id": "US_02_01_OIL_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 193296.171875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_OIL_SERVICE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_FACTORY_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_FACTORY_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_SERVICE_HUB"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_04_01_TSK_FORKLIFT": {
                    "id": "US_04_01_TSK_FORKLIFT",
                    "isFinished": false,
                    "spentTime": 126621.90625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_04_01 || US_04_01_TSK_FL_02",
                                        "map": "level_us_04_01",
                                        "cached": true,
                                        "zoneLocal": "US_04_01_TSK_FL_02"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBarrels",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_04_01",
                                    "platformId": "US_04_01_TSK_FL_03",
                                    "zones": [
                                        "US_04_01_TSK_FL_04"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 1
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_POWERLINE_INSPECTION_OBJ": {
                    "id": "RU_03_01_POWERLINE_INSPECTION_OBJ",
                    "isFinished": false,
                    "spentTime": 130309.6640625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_START",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_4",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_5",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_POWERLINE_END",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_LONG_LOGS_2_OBJ": {
                    "id": "US_01_04_LONG_LOGS_2_OBJ",
                    "isFinished": false,
                    "spentTime": 192360.328125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_QUARRY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_DRILLING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_TOWN_STORAGE_OBJ": {
                    "id": "US_01_01_TOWN_STORAGE_OBJ",
                    "isFinished": true,
                    "spentTime": 182710.796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "FARMERS_FUEL",
                                    "deliveryZones": [
                                        "US_01_01_TOWN_STORAGE"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_TOWN_STORAGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_TOWN_STORAGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_VILLAGE_DELIVERY_OBJ": {
                    "id": "US_02_02_VILLAGE_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 140671.453125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_VILLAGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_VILLAGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_THE_PLACE_BEYOND_THE_SPRUCES_TSK": {
                    "id": "US_01_01_THE_PLACE_BEYOND_THE_SPRUCES_TSK",
                    "isFinished": true,
                    "spentTime": 179543.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_THE_PLACE_BEYOND_THE_SPRUCES",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_MATERIALS_ORDER_OBJ": {
                    "id": "US_01_02_MATERIALS_ORDER_OBJ",
                    "isFinished": false,
                    "spentTime": 123407.3125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteSlab",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_SERVICE_HUB"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_PREACHER_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_QUARRY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_KING_OF_HILLS_TSK": {
                    "id": "US_01_01_KING_OF_HILLS_TSK",
                    "isFinished": true,
                    "spentTime": 180003.796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_SOUTH_PEAK",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_NORTH_PEAK",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_RESOURCES_FOR_WINTER_OBJ": {
                    "id": "US_01_02_RESOURCES_FOR_WINTER_OBJ",
                    "isFinished": true,
                    "spentTime": 101729.8359375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "SERVICE_OIL_TRAILER",
                                    "deliveryZones": [
                                        "US_01_02_LOGISTICS_BASE"
                                    ],
                                    "mapDelivery": "level_us_01_02",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoVehiclesSpareParts",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_LOGISTICS_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_SWAMP_CROSSING_02_TSK": {
                    "id": "US_01_03_SWAMP_CROSSING_02_TSK",
                    "isFinished": true,
                    "spentTime": 74751.9765625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_SWAMP_CROSSING_02_OBJ"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_DROWNED_TRUCK_03_TSK": {
                    "id": "US_01_01_DROWNED_TRUCK_03_TSK",
                    "isFinished": false,
                    "spentTime": 109214.6171875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "FARMER_TRUCK_03",
                                    "deliveryZones": [
                                        "US_01_01_FARM"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_MILL_DELIVERY_OBJ": {
                    "id": "US_02_02_MILL_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 5593.2373046875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 4,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoPipesSmall",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_03_POLAR_BASE_OBJ": {
                    "id": "US_02_03_POLAR_BASE_OBJ",
                    "isFinished": false,
                    "spentTime": 932.31707763671875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_EXPLORING_TRUCK_OBJ": {
                    "id": "US_01_01_EXPLORING_TRUCK_OBJ",
                    "isFinished": true,
                    "spentTime": 195067.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_TRUCK",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_FACTORY_RECOVERY_OBJ": {
                    "id": "US_01_01_FACTORY_RECOVERY_OBJ",
                    "isFinished": true,
                    "spentTime": 192461.484375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "FUEL_FACTORY",
                                    "deliveryZones": [
                                        "US_01_01_FACTORY"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBricks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FACTORY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FACTORY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_ROCK_TSK": {
                    "id": "US_02_01_ROCK_TSK",
                    "isFinished": true,
                    "spentTime": 145262.796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_ROCKS_START_01_TSK",
                                        "US_02_01_ROCKS_START_02_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_RADIOSTATION_TSK": {
                    "id": "US_02_01_RADIOSTATION_TSK",
                    "isFinished": true,
                    "spentTime": 163244.234375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_02_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_02_01_RADIOSTATION",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_04_01_TSK_ROCKS_01": {
                    "id": "US_04_01_TSK_ROCKS_01",
                    "isFinished": false,
                    "spentTime": 127080.9765625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_04_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_04_01_TSK_ROCKS_01_01",
                                        "US_04_01_TSK_ROCKS_01_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "US_04_01_ROCKS_OBJECTIVE",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_LOST_CONTAINERS_OBJ": {
                    "id": "US_01_01_LOST_CONTAINERS_OBJ",
                    "isFinished": false,
                    "spentTime": 174639.296875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_01 || US_01_01_LOST_CONTAINERS_A",
                                        "map": "level_us_01_01",
                                        "cached": true,
                                        "zoneLocal": "US_01_01_LOST_CONTAINERS_A"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoServiceSparePartsSpecial",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSparePartsSpecial",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_WAREHOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_ROUTE_CHECK_OBJ": {
                    "id": "RU_03_01_ROUTE_CHECK_OBJ",
                    "isFinished": true,
                    "spentTime": 130321.1796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_ROUTE_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_ROUTE_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_ROUTE_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_ROUTE_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_ROUTE_4",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_ROUTE_5",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_ROUTE_6",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_FIND_THE_ANTENNA_TOWER_TSK": {
                    "id": "US_01_02_FIND_THE_ANTENNA_TOWER_TSK",
                    "isFinished": true,
                    "spentTime": 166592.796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_02",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_02_ANTENNA_TOWER",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_LOG_FARM_SUPPLY_OBJ": {
                    "id": "RU_02_02_LOG_FARM_SUPPLY_OBJ",
                    "isFinished": false,
                    "spentTime": 30192.556640625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 6,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_03_TOWN_DELIVERY_OBJ": {
                    "id": "US_02_03_TOWN_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 929.9619140625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteBlocks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_TOWN"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoPipesSmall",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_TOWN"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_TOWN"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_LOST_CARGO_01_TSK": {
                    "id": "RU_02_02_LOST_CARGO_01_TSK",
                    "isFinished": false,
                    "spentTime": 157681.984375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "RU_02_02_LOST_CARGO_01_OILTANK",
                                    "deliveryZones": [
                                        "RU_02_02_LOST_CARGO_01_TARGET"
                                    ],
                                    "mapDelivery": "level_ru_02_02",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_WOODEN_PLANKS_DELIVERY": {
                    "id": "RU_02_02_WOODEN_PLANKS_DELIVERY",
                    "isFinished": false,
                    "spentTime": 30189.326171875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 5,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_RAILWAY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_03_DERRY_LONGHORN_TSK": {
                    "id": "US_02_03_DERRY_LONGHORN_TSK",
                    "isFinished": false,
                    "spentTime": 4784.51025390625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "DERRY_LONGHORN_3194",
                                    "deliveryZones": [
                                        "US_02_03_DERRY_LONGHORN_PARKING"
                                    ],
                                    "mapDelivery": "level_us_02_03_new",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_SWAMP_CROSSING_01_TSK": {
                    "id": "US_01_03_SWAMP_CROSSING_01_TSK",
                    "isFinished": true,
                    "spentTime": 70595.5625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_SWAMP_CROSSING_01_OBJ"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_BUILD_A_BRIDGE_OBJ": {
                    "id": "US_01_01_BUILD_A_BRIDGE_OBJ",
                    "isFinished": true,
                    "spentTime": 194453.078125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_BROKEN_BRIDGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_BROKEN_BRIDGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_ROCK_FALL_TSK": {
                    "id": "US_02_01_ROCK_FALL_TSK",
                    "isFinished": true,
                    "spentTime": 157838.359375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_ROCKS_FALL_01_TSK",
                                        "US_02_01_ROCKS_FALL_02_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_OIL_DELIVERY_02_OBJ": {
                    "id": "US_02_01_OIL_DELIVERY_02_OBJ",
                    "isFinished": true,
                    "spentTime": 7361.330078125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 4,
                                        "curValue": 4
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_SERVICE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_LOGS_01_OBJ": {
                    "id": "US_02_01_LOGS_01_OBJ",
                    "isFinished": false,
                    "spentTime": 140658.328125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_RESEARCH": {
                    "id": "RU_02_02_RESEARCH",
                    "isFinished": false,
                    "spentTime": 30184.61328125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": {
                                "map": "level_ru_02_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_02_02_GA_01",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_02_02_GA_02",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_02_02_GA_03",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_VILLAGE_SCOUTING_TSK": {
                    "id": "RU_03_01_VILLAGE_SCOUTING_TSK",
                    "isFinished": false,
                    "spentTime": 129899.46875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_VILLAGE_RUINS_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_VILLAGE_RUINS_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_VILLAGE_RUINS_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_VILLAGE_RUINS_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_ANTIQUE_TRUCK_HUNT_TSK": {
                    "id": "RU_03_01_ANTIQUE_TRUCK_HUNT_TSK",
                    "isFinished": false,
                    "spentTime": 91306.1015625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "ANTIQUE_TRUCK",
                                    "deliveryZones": [
                                        "RU_03_01_ANTIQUE_TRUCK_HUNT_TARGET"
                                    ],
                                    "mapDelivery": "level_ru_03_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_FIX_A_BRIDGE_TSK": {
                    "id": "US_02_01_FIX_A_BRIDGE_TSK",
                    "isFinished": true,
                    "spentTime": 166237.171875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_FIX_A_BRIDGE_A_TSK",
                                        "US_02_01_FIX_A_BRIDGE_B_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_CAMP_GAS_DELIVEY_TSK": {
                    "id": "RU_03_01_CAMP_GAS_DELIVEY_TSK",
                    "isFinished": false,
                    "spentTime": 124536.0234375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "CAMP_GAS_DELIVERY_TRAILER",
                                    "deliveryZones": [
                                        "RU_03_01_CAMP_2"
                                    ],
                                    "mapDelivery": "level_ru_03_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_04_01_TSK_13": {
                    "id": "US_04_01_TSK_13",
                    "isFinished": false,
                    "spentTime": 127377.8359375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_04_01 || US_04_01_TSK_13_02",
                                        "map": "level_us_04_01",
                                        "cached": true,
                                        "zoneLocal": "US_04_01_TSK_13_02"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoVehiclesSpareParts",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_04_01 || US_04_01_TSK_13_03",
                                        "map": "level_us_04_01",
                                        "cached": true,
                                        "zoneLocal": "US_04_01_TSK_13_03"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoVehiclesSpareParts",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoVehiclesSpareParts",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_04_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_04_01_TSK_13_04"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [
                                {
                                    "truckId": "US_04_01_TSK_13_TRUCK",
                                    "isRepaired": false,
                                    "isRefueled": true
                                }
                            ],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_04_01_TSK_CAT": {
                    "id": "US_04_01_TSK_CAT",
                    "isFinished": true,
                    "spentTime": 128470.578125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "US_04_01_CAT770_TRAILER",
                                    "deliveryZones": [
                                        "US_04_01_TSK_CAT_03"
                                    ],
                                    "mapDelivery": "level_us_04_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [
                                {
                                    "truckId": "US_04_01_CAT770G",
                                    "isRepaired": true,
                                    "isRefueled": true
                                }
                            ],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_04_MATERIAL_DELIVERYING_TSK": {
                    "id": "US_02_04_MATERIAL_DELIVERYING_TSK",
                    "isFinished": false,
                    "spentTime": 234.2935791015625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_02_04_new || US_02_04_DRILLING_SITE",
                                        "map": "level_us_02_04_new",
                                        "cached": true,
                                        "zoneLocal": "US_02_04_DRILLING_SITE"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBarrelsOil",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_04_FACTORY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_04_FACTORY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_04_01_TSK_07": {
                    "id": "US_04_01_TSK_07",
                    "isFinished": false,
                    "spentTime": 127979.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "US_04_01_TSK_07_TRUCK",
                                    "deliveryZones": [
                                        "US_04_01_TSK_07_02"
                                    ],
                                    "mapDelivery": "level_us_04_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_STUCK_SCOUT_TSK": {
                    "id": "US_02_01_STUCK_SCOUT_TSK",
                    "isFinished": true,
                    "spentTime": 30955.56640625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "STUCK_SCOUT_R",
                                    "deliveryZones": [
                                        "US_02_01_CAMP"
                                    ],
                                    "mapDelivery": "level_us_02_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_LANDSLIDE_TSK": {
                    "id": "US_01_01_LANDSLIDE_TSK",
                    "isFinished": true,
                    "spentTime": 184009.421875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_LANDSLIDE_TSK",
                                        "US_01_01_LANDSLIDE_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_LANDSLIDE_TSK",
                                        "US_01_01_LANDSLIDE_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_MED_LOGS_OBJ": {
                    "id": "US_01_04_MED_LOGS_OBJ",
                    "isFinished": false,
                    "spentTime": 109623.78125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_FIND_LOST_TRUCK_DELIVERY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_FALLEN_CARGO_DELIVERY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_EXPLORING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_DRILL_DELIVERY_OBJ": {
                    "id": "US_02_01_DRILL_DELIVERY_OBJ",
                    "isFinished": true,
                    "spentTime": 140619.734375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoContainerSmall",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_DRILLING_SITE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoPipesMedium",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_DRILLING_SITE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_LOG_CAMP_DELIVERY_OBJ": {
                    "id": "RU_03_02_LOG_CAMP_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 130334.140625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 3,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_02_WAREHOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_03_FAILED_FISHING_A_TSK": {
                    "id": "US_02_03_FAILED_FISHING_A_TSK",
                    "isFinished": false,
                    "spentTime": 3969.69140625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "STUCK_SCOUT",
                                    "deliveryZones": [
                                        "US_02_03_FAILED_FISHING_PARK"
                                    ],
                                    "mapDelivery": "level_us_02_03_new",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_DISASS_OBJ": {
                    "id": "US_02_02_DISASS_OBJ",
                    "isFinished": false,
                    "spentTime": 5681.552734375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "US_02_02_RIG",
                                    "deliveryZones": [
                                        "US_02_01_DRILL_BIT_TARGET"
                                    ],
                                    "mapDelivery": "level_us_02_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_OILTANK_DELIVERY_TSK": {
                    "id": "US_02_01_OILTANK_DELIVERY_TSK",
                    "isFinished": true,
                    "spentTime": 164401.171875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "EQUIPMENT",
                                    "deliveryZones": [
                                        "US_02_01_GAS_STATION_01"
                                    ],
                                    "mapDelivery": "level_us_02_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_CAMP_ROUTE_CHECK_TSK": {
                    "id": "RU_03_01_CAMP_ROUTE_CHECK_TSK",
                    "isFinished": false,
                    "spentTime": 129190.0859375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_CAMP_ROUTE_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "RU_03_01_CAMP_ROUTE_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_CAMP_ROUTE_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_CAMP_ROUTE_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_CAMP_ROUTE_4",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_HELI_CARGO_RECOVERY_TSK": {
                    "id": "RU_03_01_HELI_CARGO_RECOVERY_TSK",
                    "isFinished": false,
                    "spentTime": 90184.8515625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_ru_03_01 || RU_03_01_HELI_CARGO_RECOVERY_SPAWN",
                                        "map": "level_ru_03_01",
                                        "cached": true,
                                        "zoneLocal": "RU_03_01_HELI_CARGO_RECOVERY_SPAWN"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoVehiclesSpareParts",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoVehiclesSpareParts",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_01",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_01_HELI_CARGO_RECOVERY_TARGET"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_WOODEN_BRIDGE_TSK": {
                    "id": "US_01_02_WOODEN_BRIDGE_TSK",
                    "isFinished": true,
                    "spentTime": 172660.046875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_WOODEN_BRIDGE_A_TSK",
                                        "US_01_02_WOODEN_BRIDGE_B_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_SERVICE_RETURN_TSK": {
                    "id": "US_02_01_SERVICE_RETURN_TSK",
                    "isFinished": true,
                    "spentTime": 162998.140625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "SERVICE",
                                    "deliveryZones": [
                                        "US_02_01_FACTORY_02"
                                    ],
                                    "mapDelivery": "level_us_02_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_04_MOUNTAIN_CLEANING_TSK": {
                    "id": "US_02_04_MOUNTAIN_CLEANING_TSK",
                    "isFinished": false,
                    "spentTime": 471.13916015625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_04_MOUNTAIN_BUILDING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "Rock_Fall",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_BASE_SUPPLIES_TSK": {
                    "id": "RU_03_01_BASE_SUPPLIES_TSK",
                    "isFinished": false,
                    "spentTime": 90160.09375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_ru_03_01 || RU_03_01_OLD_BASE",
                                        "map": "level_ru_03_01",
                                        "cached": true,
                                        "zoneLocal": "RU_03_01_OLD_BASE"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoRadioactive",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoRadioactive",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_01",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_01_PORT_DROPOFF"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_01": {
                    "id": "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_01",
                    "isFinished": true,
                    "spentTime": 68363.859375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "dropped_vechicle_1",
                                    "deliveryZones": [
                                        "US_01_03_DROPPED_VEHICLE_SEARCHING_1_DELIVERY"
                                    ],
                                    "mapDelivery": "level_us_01_03",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_02": {
                    "id": "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_02",
                    "isFinished": true,
                    "spentTime": 86122.2734375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "dropped_vechicle_2",
                                    "deliveryZones": [
                                        "US_01_03_CAR_02_ZONE_DROP_DELIVERY"
                                    ],
                                    "mapDelivery": "level_us_01_03",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_03": {
                    "id": "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_03",
                    "isFinished": true,
                    "spentTime": 75139.2734375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_03",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_03_EXPEDITION_1_ZONE",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_03_EXPEDITION_2_ZONE",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_03_EXPEDITION_3_ZONE",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_03_EXPEDITION_3_ZONE_ADD",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_03_EXPEDITION_4_ZONE",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_03_EXPEDITION_5_ZONE",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_TSTOP_DELIVERY_OBJ": {
                    "id": "US_02_02_TSTOP_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 140690.546875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_TRUCK_STOP"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 4,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_TRUCK_STOP"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_TRUCK_STOP"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_HUMMER_TSK": {
                    "id": "US_02_01_HUMMER_TSK",
                    "isFinished": true,
                    "spentTime": 189230.265625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "HUMMER",
                                    "deliveryZones": [
                                        "US_02_01_HUMMER_PARK"
                                    ],
                                    "mapDelivery": "level_us_02_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_MULTIORDER_OBJ": {
                    "id": "US_01_04_MULTIORDER_OBJ",
                    "isFinished": false,
                    "spentTime": 38141.79296875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_LOGISTICS_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_LOGISTICS_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_LOGISTICS_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_LOGISTICS_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_METAL_LOADING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_METAL_LOADING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteBlocks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_METAL_LOADING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoVehiclesSpareParts",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_OLD_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_OLD_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_PORT_CARGO"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteSlab",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_PORT_CARGO"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_SHORT_CUT_TSK": {
                    "id": "US_01_03_SHORT_CUT_TSK",
                    "isFinished": true,
                    "spentTime": 86159.59375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_SHORT_CUT_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "bridge_wooden_big_short_02",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_SHORT_CUT_01",
                                        "US_01_03_SHORT_CUT_01_ADD"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "bridge_wooden_big_short_01",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_LOST_BAGS_TSK": {
                    "id": "US_01_02_LOST_BAGS_TSK",
                    "isFinished": true,
                    "spentTime": 166854.828125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_02 || US_01_02_DROPPED_BUG_A",
                                        "map": "level_us_01_02",
                                        "cached": true,
                                        "zoneLocal": "US_01_02_DROPPED_BUG_A"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBags",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_02 || US_01_02_DROPPED_BUG_B",
                                        "map": "level_us_01_02",
                                        "cached": true,
                                        "zoneLocal": "US_01_02_DROPPED_BUG_B"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBags",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_02 || US_01_02_DROPPED_BUG_C",
                                        "map": "level_us_01_02",
                                        "cached": true,
                                        "zoneLocal": "US_01_02_DROPPED_BUG_C"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBags",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_02 || US_01_02_DROPPED_BUG_D",
                                        "map": "level_us_01_02",
                                        "cached": true,
                                        "zoneLocal": "US_01_02_DROPPED_BUG_D"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBags",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 4,
                                        "curValue": 4
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_TIM_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_FARM_ORDER_OBJ": {
                    "id": "US_01_02_FARM_ORDER_OBJ",
                    "isFinished": false,
                    "spentTime": 174768.765625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBricks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_REPAIR_THE_TRUCK_TSK": {
                    "id": "US_01_02_REPAIR_THE_TRUCK_TSK",
                    "isFinished": true,
                    "spentTime": 84806.859375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [
                                {
                                    "truckId": "REP_TRUCK",
                                    "isRepaired": true,
                                    "isRefueled": true
                                }
                            ],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_BARRELS_OBJ": {
                    "id": "US_02_01_BARRELS_OBJ",
                    "isFinished": true,
                    "spentTime": 160528.109375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_PORT"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_MISSED_OILTANK_TSK": {
                    "id": "US_01_01_MISSED_OILTANK_TSK",
                    "isFinished": false,
                    "spentTime": 182531.578125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "MISSED_OILTANK",
                                    "deliveryZones": [
                                        "US_01_01_MISSED_OILTANK_PARK"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_LOCAL_ENTERTAINMENT_TSK": {
                    "id": "US_01_01_LOCAL_ENTERTAINMENT_TSK",
                    "isFinished": false,
                    "spentTime": 178261.546875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_01_BARRELS_01",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_01_BARRELS_02",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_01_BARRELS_03",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_01_BARRELS_04",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_01_BARRELS_05",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_ARCH_CNT": {
                    "id": "RU_03_02_ARCH_CNT",
                    "isFinished": false,
                    "spentTime": 32237.638671875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_ARCH_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_ARCH_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_ARCH_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_FARM_SUPPLY": {
                    "id": "RU_02_02_FARM_SUPPLY",
                    "isFinished": false,
                    "spentTime": 30198.763671875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_FACTORY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteSlab",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_VILLAGE_TSK": {
                    "id": "RU_03_02_VILLAGE_TSK",
                    "isFinished": false,
                    "spentTime": 23989.341796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_VILLAGE_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_VILLAGE_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_VILLAGE_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_WORK_FOR_OLD_SWEAT_OBJ": {
                    "id": "US_01_02_WORK_FOR_OLD_SWEAT_OBJ",
                    "isFinished": false,
                    "spentTime": 123404.7578125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteSlab",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_QUARRY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_QUARRY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_FARM_DELIVERY_OBJ": {
                    "id": "US_01_01_FARM_DELIVERY_OBJ",
                    "isFinished": true,
                    "spentTime": 192257.890625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "TOOLS_FOR_FARMERS",
                                    "deliveryZones": [
                                        "US_01_01_FARM"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_SWAMP_EXPLORATION_TSK": {
                    "id": "US_01_01_SWAMP_EXPLORATION_TSK",
                    "isFinished": true,
                    "spentTime": 183993.015625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_PUMP_01",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_PUMP_02",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_PUMP_03",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_STONE_FALL_TSK": {
                    "id": "US_02_01_STONE_FALL_TSK",
                    "isFinished": true,
                    "spentTime": 161351.953125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_STONE_FALL_01_TSK",
                                        "US_02_01_STONE_FALL_02_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_BRICKS_ON_RIVER_TSK": {
                    "id": "US_02_02_BRICKS_ON_RIVER_TSK",
                    "isFinished": false,
                    "spentTime": 142178.046875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_02_02_new || US_02_02_BRICKS_01",
                                        "map": "level_us_02_02_new",
                                        "cached": true,
                                        "zoneLocal": "US_02_02_BRICKS_01"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBricks",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_02_02_new || US_02_02_BRICKS_02",
                                        "map": "level_us_02_02_new",
                                        "cached": true,
                                        "zoneLocal": "US_02_02_BRICKS_02"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBricks",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_02_02_new || US_02_02_BRICKS_03",
                                        "map": "level_us_02_02_new",
                                        "cached": true,
                                        "zoneLocal": "US_02_02_BRICKS_03"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBricks",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBricks",
                                        "aimValue": 3,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_WAREHOUSE_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_POWER_WIRES_1_CONTRACT_OBJ": {
                    "id": "US_01_03_POWER_WIRES_1_CONTRACT_OBJ",
                    "isFinished": true,
                    "spentTime": 94994.8125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_RESTORE_POWER_WIRES_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "power_wires_01",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_RESTORE_POWER_WIRES_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "power_wires_02",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_RESTORE_POWER_WIRES_03"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "power_wires_03",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_LIGHTHOUSE_TSK": {
                    "id": "RU_03_02_LIGHTHOUSE_TSK",
                    "isFinished": false,
                    "spentTime": 32155.5625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_LIGHTHOUSE",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_04_BRIDGE_BUILDING_TSK": {
                    "id": "US_02_04_BRIDGE_BUILDING_TSK",
                    "isFinished": false,
                    "spentTime": 438.0484619140625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 4,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_04_BRIDGE_BUILDING",
                                        "US_02_04_BRIDGE_BUILDING_ADD"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_HUB_RECOVERY": {
                    "id": "RU_02_02_HUB_RECOVERY",
                    "isFinished": false,
                    "spentTime": 30195.025390625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "RU_02_02_RAILWAY_OILTANK",
                                    "deliveryZones": [
                                        "RU_02_02_OILTANK_TARGET"
                                    ],
                                    "mapDelivery": "level_ru_02_02",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_BUNKER_OBJ": {
                    "id": "RU_03_01_BUNKER_OBJ",
                    "isFinished": false,
                    "spentTime": 89151.921875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_BUNKER_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_BUNKER_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_BUNKER_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_03_BLOCKED_TUNNEL_TSK": {
                    "id": "US_02_03_BLOCKED_TUNNEL_TSK",
                    "isFinished": false,
                    "spentTime": 2178.98291015625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoPipesSmall",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_BLOCKED_TUNNEL_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteBlocks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_BLOCKED_TUNNEL_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_CAMP_RESUPPLY_TSK": {
                    "id": "RU_03_01_CAMP_RESUPPLY_TSK",
                    "isFinished": false,
                    "spentTime": 130397.671875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_01",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_01_CAMP_0"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_01",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_01_CAMP_1"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_FOOD_FOR_WORKERS_TSK": {
                    "id": "US_01_02_FOOD_FOR_WORKERS_TSK",
                    "isFinished": false,
                    "spentTime": 105955.6484375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoCrateLarge",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_DRILLING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_PIPELINE_OBJ": {
                    "id": "US_02_02_PIPELINE_OBJ",
                    "isFinished": false,
                    "spentTime": 5677.5966796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_PIPELINE",
                                        "US_02_02_PIPELINE_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_PIPELINE",
                                        "US_02_02_PIPELINE_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoPipesMedium",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_PIPELINE",
                                        "US_02_02_PIPELINE_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoPipesSmall",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_PIPELINE",
                                        "US_02_02_PIPELINE_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_04_LOST_CARGO_TSK": {
                    "id": "US_02_04_LOST_CARGO_TSK",
                    "isFinished": false,
                    "spentTime": 206.08883666992188,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_02_04_new || US_02_04_LOST_CARGO",
                                        "map": "level_us_02_04_new",
                                        "cached": true,
                                        "zoneLocal": "US_02_04_LOST_CARGO"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoVehiclesSpareParts",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoVehiclesSpareParts",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_04_LOST_CARGO_DELIVERY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_LOG_VILLAGE_DELIVERY_OBJ": {
                    "id": "RU_03_01_LOG_VILLAGE_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 130332.625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 3,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_01",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_01_VILLAGE_DROPOFF"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_MED_LOGS_2_OBJ": {
                    "id": "US_01_04_MED_LOGS_2_OBJ",
                    "isFinished": false,
                    "spentTime": 109642.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 3,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_FORESTER_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_NORTON_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_HERMIT_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_MICHIGAN_TRIAL_TSK": {
                    "id": "US_01_02_MICHIGAN_TRIAL_TSK",
                    "isFinished": false,
                    "spentTime": 86392.09375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_02_FLAG_A",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_02_FLAG_B",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_02_FLAG_C",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_02_FLAG_D",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "US_01_02_FLAG_E",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_CARGO_DELIVERING_OBJ": {
                    "id": "US_01_04_CARGO_DELIVERING_OBJ",
                    "isFinished": true,
                    "spentTime": 56140.421875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "us_01_04_special",
                                    "deliveryZones": [
                                        "US_01_02_DRILLING"
                                    ],
                                    "mapDelivery": "level_us_01_02",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_DRILLING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBigDrill",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_DRILLING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_FALLEN_ROCKS_TSK": {
                    "id": "US_01_02_FALLEN_ROCKS_TSK",
                    "isFinished": true,
                    "spentTime": 175415.734375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_FALLEN_ROCKS_A_TSK",
                                        "US_01_02_FALLEN_ROCKS_B_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_LOST_TUBE_TSK": {
                    "id": "US_02_01_LOST_TUBE_TSK",
                    "isFinished": true,
                    "spentTime": 163197.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_02_01 || US_02_01_TUBE_SPAWN",
                                        "map": "level_us_02_01",
                                        "cached": true,
                                        "zoneLocal": "US_02_01_TUBE_SPAWN"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoPipeLarge",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoPipeLarge",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_DRILLING_SITE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_POLAR_BASE_OBJ": {
                    "id": "US_02_01_POLAR_BASE_OBJ",
                    "isFinished": false,
                    "spentTime": 140648.953125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBricks",
                                        "aimValue": 4,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_DISASS_OBJ": {
                    "id": "US_02_01_DISASS_OBJ",
                    "isFinished": true,
                    "spentTime": 140635.296875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "US_02_01_RIG",
                                    "deliveryZones": [
                                        "US_02_01_DRILL_BIT_TARGET"
                                    ],
                                    "mapDelivery": "level_us_02_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_BOATMAN_TOOLS_DELIVERY_TSK": {
                    "id": "US_01_01_BOATMAN_TOOLS_DELIVERY_TSK",
                    "isFinished": false,
                    "spentTime": 147669.109375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_BOATMAN_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_BOATMAN_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_LONG_LOGS_OBJ": {
                    "id": "US_01_04_LONG_LOGS_OBJ",
                    "isFinished": true,
                    "spentTime": 174734.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 3,
                                        "curValue": 3
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 3,
                                        "curValue": 3
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoLogsMedium",
                                        "aimValue": 3,
                                        "curValue": 3
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_TOWN_STORAGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_LOST_CARGO_TSK": {
                    "id": "US_01_03_LOST_CARGO_TSK",
                    "isFinished": true,
                    "spentTime": 67570.8984375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoContainerLargeDrilling",
                                        "aimValue": 3,
                                        "curValue": 3
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_DRILLING_CARGO"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_UNLUCKY_FISHERMAN_TSK": {
                    "id": "US_01_02_UNLUCKY_FISHERMAN_TSK",
                    "isFinished": false,
                    "spentTime": 171808.078125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "FISHERMAN_CAR",
                                    "deliveryZones": [
                                        "US_01_02_FISHERMAN_HOUSE"
                                    ],
                                    "mapDelivery": "level_us_01_02",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_STUCK_TRAILER_TSK": {
                    "id": "US_01_01_STUCK_TRAILER_TSK",
                    "isFinished": false,
                    "spentTime": 101047.7265625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "STUCK_TRAILER",
                                    "deliveryZones": [
                                        "US_01_01_STUCK_TRAILER_PARK"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_LOG_WAREHOUSE_SUPPLY_OBJ": {
                    "id": "RU_03_02_LOG_WAREHOUSE_SUPPLY_OBJ",
                    "isFinished": false,
                    "spentTime": 130335.1171875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 3,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_02_WAREHOUSE_LOADING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_WORKING_STIFF_TSK": {
                    "id": "US_02_02_WORKING_STIFF_TSK",
                    "isFinished": true,
                    "spentTime": 143109.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [
                                {
                                    "truckId": "WORKING_STIFF",
                                    "isRepaired": true,
                                    "isRefueled": true
                                }
                            ],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "WORKING_STIFF",
                                    "deliveryZones": [
                                        "US_02_02_MILL"
                                    ],
                                    "mapDelivery": "level_us_02_02_new",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_MOBILE_WATCHTOWER_RECOVERY_OBJ": {
                    "id": "RU_03_01_MOBILE_WATCHTOWER_RECOVERY_OBJ",
                    "isFinished": true,
                    "spentTime": 130329.1328125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "MOBILE_TOWER_RECOVERY_TRAILER",
                                    "deliveryZones": [
                                        "RU_03_01_VILLAGE_DROPOFF"
                                    ],
                                    "mapDelivery": "level_ru_03_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_SUPPLIES_FOR_REGION_2_OBJ": {
                    "id": "US_01_04_SUPPLIES_FOR_REGION_2_OBJ",
                    "isFinished": false,
                    "spentTime": 38150.6640625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_TOWN_STORAGE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_WAREHOUSE_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBags",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_LOG_LOADING"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_RIVER_CROSSING_TSK": {
                    "id": "US_01_02_RIVER_CROSSING_TSK",
                    "isFinished": true,
                    "spentTime": 41778.32421875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "TRAILER_CROSSING",
                                    "deliveryZones": [
                                        "US_01_02_RIVER_CROSSING"
                                    ],
                                    "mapDelivery": "level_us_01_02",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_ROAD_BLOCKAGE_TSK": {
                    "id": "US_01_01_ROAD_BLOCKAGE_TSK",
                    "isFinished": true,
                    "spentTime": 181294.484375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_ROAD_BLOCKAGE_TSK",
                                        "US_01_01_ROAD_BLOCKAGE_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_ANTIQUES_TSK": {
                    "id": "RU_03_02_ANTIQUES_TSK",
                    "isFinished": false,
                    "spentTime": 32842.68359375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_ANTIQUES",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "ru_03_02_trailer_antique",
                                    "deliveryZones": [
                                        "RU_03_02_ANTIQUES_1"
                                    ],
                                    "mapDelivery": "level_ru_03_02",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_DROWNED_TRUCK_02_TSK": {
                    "id": "US_01_01_DROWNED_TRUCK_02_TSK",
                    "isFinished": true,
                    "spentTime": 175025.796875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "FARMER_TRUCK_02",
                                    "deliveryZones": [
                                        "US_01_01_FARM"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_NORTH_ROUTE_CHECK_OBJ": {
                    "id": "RU_03_01_NORTH_ROUTE_CHECK_OBJ",
                    "isFinished": false,
                    "spentTime": 34797.546875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_NORTH_ROUTE_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_NORTH_ROUTE_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_NORTH_ROUTE_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_NORTH_ROUTE_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_NORTH_ROUTE_4",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_NORTH_ROUTE_5",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_SWAMP_ROUTE_CHECK_OBJ": {
                    "id": "RU_03_01_SWAMP_ROUTE_CHECK_OBJ",
                    "isFinished": false,
                    "spentTime": 34799.4453125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_SWAMP_ROUTE_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_SWAMP_ROUTE_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_SWAMP_ROUTE_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_SWAMP_ROUTE_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_SWAMP_ROUTE_4",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_SWAMP_ROUTE_5",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_LUMBER_MILL_REACTIVATION_OBJ": {
                    "id": "US_01_03_LUMBER_MILL_REACTIVATION_OBJ",
                    "isFinished": true,
                    "spentTime": 94997.4375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "LUMBER_TRAILER",
                                    "deliveryZones": [
                                        "US_01_03_LUMBER_MILL_REACTIVATION"
                                    ],
                                    "mapDelivery": "level_us_01_03",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteBlocks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_LUMBER_MILL_REACTIVATION"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_LUMBER_MILL_REACTIVATION"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_LOST_CARGO_TSK": {
                    "id": "US_01_01_LOST_CARGO_TSK",
                    "isFinished": false,
                    "spentTime": 146166.328125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_01 || US_01_01_DROPPED_PALLET_01",
                                        "map": "level_us_01_01",
                                        "cached": true,
                                        "zoneLocal": "US_01_01_DROPPED_PALLET_01"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoServiceSparePartsSpecial",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_01 || US_01_01_DROPPED_PALLET_03",
                                        "map": "level_us_01_01",
                                        "cached": true,
                                        "zoneLocal": "US_01_01_DROPPED_PALLET_03"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoServiceSparePartsSpecial",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_01 || US_01_01_DROPPED_PALLET_04",
                                        "map": "level_us_01_01",
                                        "cached": true,
                                        "zoneLocal": "US_01_01_DROPPED_PALLET_04"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoServiceSparePartsSpecial",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_01 || US_01_01_DROPPED_PALLET_02",
                                        "map": "level_us_01_01",
                                        "cached": true,
                                        "zoneLocal": "US_01_01_DROPPED_PALLET_02"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoServiceSparePartsSpecial",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSparePartsSpecial",
                                        "aimValue": 4,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FACTORY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_WAREHOUSE_TSK": {
                    "id": "RU_03_02_WAREHOUSE_TSK",
                    "isFinished": false,
                    "spentTime": 18581.111328125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_02_WAREHOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_MOTEL_NEEDS_TSK": {
                    "id": "US_01_01_MOTEL_NEEDS_TSK",
                    "isFinished": true,
                    "spentTime": 108449.703125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "MOTEL_TRAILER",
                                    "deliveryZones": [
                                        "US_01_01_MOTEL"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_LANDSLIDE_1_TSK": {
                    "id": "RU_03_02_LANDSLIDE_1_TSK",
                    "isFinished": false,
                    "spentTime": 20586.494140625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_02_LANDSLIDE_1"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "03_02_landslide_1",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_SNOWED_IN_TSK": {
                    "id": "RU_03_01_SNOWED_IN_TSK",
                    "isFinished": false,
                    "spentTime": 137691.234375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [
                                {
                                    "truckId": "SNOWED_IN_TRUCK",
                                    "isRepaired": false,
                                    "isRefueled": false
                                }
                            ],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "SNOWED_IN_TRUCK",
                                    "deliveryZones": [
                                        "RU_03_01_SNOWED_IN_TARGET"
                                    ],
                                    "mapDelivery": "level_ru_03_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_DRILLING_RECOVERY_OBJ": {
                    "id": "US_01_01_DRILLING_RECOVERY_OBJ",
                    "isFinished": true,
                    "spentTime": 123361.921875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_DRILLING_SITE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBigDrill",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_DRILLING_SITE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "DRILING_SPECIAL",
                                    "deliveryZones": [
                                        "US_01_01_DRILLING_SITE"
                                    ],
                                    "mapDelivery": "level_us_01_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_04_01_TSK_BRIDGE_01": {
                    "id": "US_04_01_TSK_BRIDGE_01",
                    "isFinished": true,
                    "spentTime": 126342.6953125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_04_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_04_01_TSK_BRIDGE_01_01",
                                        "US_04_01_TSK_BRIDGE_01_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "US_04_01_BRIDGE_01_OBJ",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_ABANDONED_SUPPLIES_TSK": {
                    "id": "US_02_01_ABANDONED_SUPPLIES_TSK",
                    "isFinished": true,
                    "spentTime": 163528.484375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "SUPPLIES_A",
                                    "deliveryZones": [
                                        "US_02_01_POLAR_BASE"
                                    ],
                                    "mapDelivery": "level_us_02_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_CAMP_SETUP_OBJ": {
                    "id": "RU_03_01_CAMP_SETUP_OBJ",
                    "isFinished": false,
                    "spentTime": 89138.4140625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "CABIN_NW_CAMP",
                                    "deliveryZones": [
                                        "RU_03_01_CAMP_0"
                                    ],
                                    "mapDelivery": "level_ru_03_01",
                                    "isDelivered": false
                                },
                                {
                                    "truckId": "CABIN_S_CAMP",
                                    "deliveryZones": [
                                        "RU_03_01_CAMP_0"
                                    ],
                                    "mapDelivery": "level_ru_03_01",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_FALLEN_CARGO_TSK": {
                    "id": "US_01_04_FALLEN_CARGO_TSK",
                    "isFinished": false,
                    "spentTime": 59006.61328125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_04_new || US_01_04_FALLEN_CARGO_1",
                                        "map": "level_us_01_04_new",
                                        "cached": true,
                                        "zoneLocal": "US_01_04_FALLEN_CARGO_1"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBarrelsOil",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_04_new || US_01_04_FALLEN_CARGO_2",
                                        "map": "level_us_01_04_new",
                                        "cached": true,
                                        "zoneLocal": "US_01_04_FALLEN_CARGO_2"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBarrelsOil",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_FALLEN_CARGO_DELIVERY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_TRUCK_REPAIR": {
                    "id": "US_01_03_TRUCK_REPAIR",
                    "isFinished": true,
                    "spentTime": 85789.546875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [
                                {
                                    "truckId": "us_01_03_twin_repair",
                                    "isRepaired": true,
                                    "isRefueled": true
                                }
                            ],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_FIX_THE_ANTENNA_TSK": {
                    "id": "US_01_03_FIX_THE_ANTENNA_TSK",
                    "isFinished": false,
                    "spentTime": 62337.80078125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoContainerSmall",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_FIX_THE_ANTENNA_DELIVERY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_POWERLINE_CHECK_TSK": {
                    "id": "US_02_01_POWERLINE_CHECK_TSK",
                    "isFinished": true,
                    "spentTime": 163480.703125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_02_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_02_01_POWERLINE_A",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_02_01_POWERLINE_B",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_02_01_POWERLINE_C",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": true,
                                        "zone": "US_02_01_POWERLINE_D",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_LOG_LUMBERMILL_RESTOCK_OBJ": {
                    "id": "RU_02_02_LOG_LUMBERMILL_RESTOCK_OBJ",
                    "isFinished": false,
                    "spentTime": 30190.501953125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoLogsLong",
                                        "aimValue": 3,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_LUMBER_MILL"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_02_TANK_CNT": {
                    "id": "RU_03_02_TANK_CNT",
                    "isFinished": false,
                    "spentTime": 32234.62890625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": true,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_ru_03_02 || RU_03_02_TANK_SPAWN",
                                        "map": "level_ru_03_02",
                                        "cached": true,
                                        "zoneLocal": "RU_03_02_TANK_SPAWN"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBA20",
                                            "count": 1
                                        }
                                    ]
                                },
                                {
                                    "needToBeDiscoveredByMetallodetector": true,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_ru_03_02 || RU_03_02_TANK_SPAWN_1",
                                        "map": "level_ru_03_02",
                                        "cached": true,
                                        "zoneLocal": "RU_03_02_TANK_SPAWN_1"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoBA20Add",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_UPG_DETECTOR",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_02",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_02_TANK_SPAWN_SEARCH",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBA20",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_02_AIRPORT"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBA20Add",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_03_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_03_02_AIRPORT"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_PIPELINE_OBJ": {
                    "id": "US_02_01_PIPELINE_OBJ",
                    "isFinished": true,
                    "spentTime": 193584.984375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_PIPELINE",
                                        "US_02_01_PIPELINE_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_DAMAGED_TRUCK_04_TSK": {
                    "id": "RU_02_02_DAMAGED_TRUCK_04_TSK",
                    "isFinished": true,
                    "spentTime": 157459.921875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [
                                {
                                    "truckId": "RU_02_02_DAMAGED_TRUCK_04_TRK",
                                    "isRepaired": true,
                                    "isRefueled": true
                                }
                            ],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_STUCK_TRUCK_03_TSK": {
                    "id": "RU_02_02_STUCK_TRUCK_03_TSK",
                    "isFinished": true,
                    "spentTime": 29291.376953125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "RU_02_02_STUCK_TRUCK_03_TRK",
                                    "deliveryZones": [
                                        "RU_02_02_REPAIR"
                                    ],
                                    "mapDelivery": "level_ru_02_02",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_SPECIAL_DELIVERY_OBJ": {
                    "id": "US_02_02_SPECIAL_DELIVERY_OBJ",
                    "isFinished": false,
                    "spentTime": 5675.38232421875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSparePartsSpecial",
                                        "aimValue": 4,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_WAREHOUSE_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_SUPPLIES_FOR_FARMERS_OBJ": {
                    "id": "US_01_01_SUPPLIES_FOR_FARMERS_OBJ",
                    "isFinished": true,
                    "spentTime": 187816.640625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBricks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_STUCK_TRUCK_TSK": {
                    "id": "RU_02_02_STUCK_TRUCK_TSK",
                    "isFinished": false,
                    "spentTime": 29943.32421875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "RU_02_02_STUCK_TRUCK_01_TRK",
                                    "deliveryZones": [
                                        "RU_02_02_STUCK_TRUCK_TARGET"
                                    ],
                                    "mapDelivery": "level_ru_02_02",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_RURAL_SPELUNKER_TSK": {
                    "id": "RU_03_01_RURAL_SPELUNKER_TSK",
                    "isFinished": false,
                    "spentTime": 129818.8125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_RURAL_SPELUNKER_TARGET_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_RURAL_SPELUNKER_TARGET_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_RURAL_SPELUNKER_TARGET_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_RURAL_SPELUNKER_TARGET_4",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_RURAL_SPELUNKER_TARGET_5",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_CARGO_FROM_SHIP_OBJ": {
                    "id": "US_01_04_CARGO_FROM_SHIP_OBJ",
                    "isFinished": false,
                    "spentTime": 38156.25,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoContainerLarge",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_WAREHOUSE_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_BUILD_A_BRIDGE_OBJ_1": {
                    "id": "US_01_04_BUILD_A_BRIDGE_OBJ_1",
                    "isFinished": true,
                    "spentTime": 169464.578125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_REBUILD_PATCH_01",
                                        "US_01_04_REBUILD_PATCH_01_ADD"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_WOODEN_BRIDGE_TSK": {
                    "id": "US_01_01_WOODEN_BRIDGE_TSK",
                    "isFinished": true,
                    "spentTime": 99628.21875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_WOODEN_BRIDGE_A",
                                        "US_01_01_WOODEN_BRIDGE_B"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_FACTORY_CHECK_TSK": {
                    "id": "RU_03_01_FACTORY_CHECK_TSK",
                    "isFinished": false,
                    "spentTime": 88309.9609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_ru_03_01",
                                "zoneStates": [
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_FACTORY_0",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_FACTORY_1",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_FACTORY_2",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    },
                                    {
                                        "isVisited": false,
                                        "zone": "RU_03_01_FACTORY_3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_FALLEN_POWER_LINES_TSK": {
                    "id": "US_01_01_FALLEN_POWER_LINES_TSK",
                    "isFinished": true,
                    "spentTime": 188451.890625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FALLEN_POWER_LINES_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteBlocks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_FALLEN_POWER_LINES_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_04_01_TSK_BRIDGE_03": {
                    "id": "US_04_01_TSK_BRIDGE_03",
                    "isFinished": false,
                    "spentTime": 127676.484375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_04_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_04_01_TSK_BRIDGE_03_01",
                                        "US_04_01_TSK_BRIDGE_03_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "US_04_01_BRIDGE_03_OBJ",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_SWAMP_CROSSING_03_TSK": {
                    "id": "US_01_03_SWAMP_CROSSING_03_TSK",
                    "isFinished": true,
                    "spentTime": 76182.78125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_03",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_03_SWAMP_CROSSING_03_OBJ"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_CLEAR_ROCKS_01_TSK": {
                    "id": "US_01_02_CLEAR_ROCKS_01_TSK",
                    "isFinished": true,
                    "spentTime": 168383.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_CLEARROCKS01_A_TSK",
                                        "US_01_02_CLEARROCKS01_B_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_03_REPAIR_THE_BRIDGE_TSK": {
                    "id": "US_02_03_REPAIR_THE_BRIDGE_TSK",
                    "isFinished": true,
                    "spentTime": 4595.751953125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_02_03_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_03_REPAIR_THE_BRIDGE_TSK",
                                        "US_02_03_REPAIR_THE_BRIDGE_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_03_FIND_THE_ANTENNA_TSK": {
                    "id": "US_01_03_FIND_THE_ANTENNA_TSK",
                    "isFinished": true,
                    "spentTime": 65819.53125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_03",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_03_FIX_THE_ANTENNA",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_SOLID_FOUNDATION_TSK": {
                    "id": "US_01_02_SOLID_FOUNDATION_TSK",
                    "isFinished": false,
                    "spentTime": 41273.55078125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [
                                {
                                    "needToBeDiscoveredByMetallodetector": false,
                                    "spawned": true,
                                    "zone": {
                                        "globalZoneId": "level_us_01_02 || US_01_02_FOUNDATION_PICKUP",
                                        "map": "level_us_01_02",
                                        "cached": true,
                                        "zoneLocal": "US_01_02_FOUNDATION_PICKUP"
                                    },
                                    "cargos": [
                                        {
                                            "name": "CargoConcreteSlab",
                                            "count": 1
                                        }
                                    ]
                                }
                            ],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteSlab",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_NORTON_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_02_02_MAZUT_DELIVERY": {
                    "id": "RU_02_02_MAZUT_DELIVERY",
                    "isFinished": false,
                    "spentTime": 30193.7734375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_FACTORY"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_VILLAGE_DROPOFF"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrelsOil",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_ru_02_02",
                                    "platformId": "",
                                    "zones": [
                                        "RU_02_02_FARM"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_LOST_TRAILER_TSK": {
                    "id": "US_01_02_LOST_TRAILER_TSK",
                    "isFinished": true,
                    "spentTime": 167830.859375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "SCOUT_OILTANK_DR",
                                    "deliveryZones": [
                                        "US_01_02_PREACHER_HOUSE"
                                    ],
                                    "mapDelivery": "level_us_01_02",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_TRAILER_PARK_TSK": {
                    "id": "US_02_01_TRAILER_PARK_TSK",
                    "isFinished": true,
                    "spentTime": 11763.82421875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_02_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_02_01_TRAILER_PARK",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_FIND_LOST_TRUCK_TSK": {
                    "id": "US_01_04_FIND_LOST_TRUCK_TSK",
                    "isFinished": false,
                    "spentTime": 170316.234375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "us_01_04_dropped_car",
                                    "deliveryZones": [
                                        "US_01_04_FIND_LOST_TRUCK_DELIVERY"
                                    ],
                                    "mapDelivery": "level_us_01_04_new",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_POLAR_BASE_OBJ": {
                    "id": "US_02_02_POLAR_BASE_OBJ",
                    "isFinished": false,
                    "spentTime": 140727.671875,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 1,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 0
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_POLAR_BASE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_EXPLORE_GARAGE_OBJ": {
                    "id": "US_01_01_EXPLORE_GARAGE_OBJ",
                    "isFinished": true,
                    "spentTime": 193895.109375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_GARAGE_ENTRANCE",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "RU_03_01_FOREIGNER_TSK": {
                    "id": "RU_03_01_FOREIGNER_TSK",
                    "isFinished": true,
                    "spentTime": 137636.953125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "FOREIGNER_TRUCK",
                                    "deliveryZones": [
                                        "RU_03_01_FOREIGNER_TARGET"
                                    ],
                                    "mapDelivery": "level_ru_03_01",
                                    "isDelivered": true
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_MOUNTAIN_BRIDGE_TSK": {
                    "id": "US_01_01_MOUNTAIN_BRIDGE_TSK",
                    "isFinished": true,
                    "spentTime": 179543.640625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_MOUNTAIN_BRIDGE_TSK",
                                        "US_01_01_MOUNTAIN_BRIDGE_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteBlocks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_01_MOUNTAIN_BRIDGE_TSK",
                                        "US_01_01_MOUNTAIN_BRIDGE_A_TSK"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_01_EXPLORING_WATCHTOWER_OBJ": {
                    "id": "US_01_01_EXPLORING_WATCHTOWER_OBJ",
                    "isFinished": true,
                    "spentTime": 195067.609375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": {
                                "map": "level_us_01_01",
                                "zoneStates": [
                                    {
                                        "isVisited": true,
                                        "zone": "US_01_01_W3",
                                        "isVisitWithCertainTruck": false,
                                        "truckUid": ""
                                    }
                                ]
                            },
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_01_SPECIAL_DELIVERY_OBJ": {
                    "id": "US_02_01_SPECIAL_DELIVERY_OBJ",
                    "isFinished": true,
                    "spentTime": 190747.640625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSparePartsSpecial",
                                        "aimValue": 4,
                                        "curValue": 4
                                    },
                                    "map": "level_us_02_01",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_01_FACTORY_01"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_BUILD_A_BRIDGE_OBJ_3": {
                    "id": "US_01_04_BUILD_A_BRIDGE_OBJ_3",
                    "isFinished": true,
                    "spentTime": 59254.12890625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_REBUILD_PATCH_03"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteSlab",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_REBUILD_PATCH_03"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoMetalPlanks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_REBUILD_PATCH_03"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                },
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteBlocks",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_REBUILD_PATCH_03"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_TRUCK_RESTORATION_TSK": {
                    "id": "US_01_02_TRUCK_RESTORATION_TSK",
                    "isFinished": false,
                    "spentTime": 169617.078125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [
                                {
                                    "truckId": "OLD_TRUCK",
                                    "deliveryZones": [
                                        "US_01_02_OLD_TRUCK_PARKZONE"
                                    ],
                                    "mapDelivery": "level_us_01_02",
                                    "isDelivered": false
                                }
                            ],
                            "cargoDeliveryActions": [],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_02_BARRELS_DELIVERY_TSK": {
                    "id": "US_01_02_BARRELS_DELIVERY_TSK",
                    "isFinished": true,
                    "spentTime": 171030.453125,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoBarrels",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_02",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_02_FORESTER_HOUSE"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_01_04_BUILD_A_BRIDGE_OBJ_2": {
                    "id": "US_01_04_BUILD_A_BRIDGE_OBJ_2",
                    "isFinished": true,
                    "spentTime": 168955.515625,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoWoodenPlanks",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_01_04_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_01_04_REBUILD_PATCH_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                },
                "US_02_02_BRIDGE_RECOVERY_TSK": {
                    "id": "US_02_02_BRIDGE_RECOVERY_TSK",
                    "isFinished": true,
                    "spentTime": 144740.359375,
                    "stagesState": [
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoConcreteSlab",
                                        "aimValue": 1,
                                        "curValue": 1
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_BRIDGE_BUILD_01",
                                        "US_02_02_BRIDGE_BUILD_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        },
                        {
                            "changeTruckState": null,
                            "cargoSpawnState": [],
                            "truckDeliveryStates": [],
                            "cargoDeliveryActions": [
                                {
                                    "cargoState": {
                                        "type": "CargoServiceSpareParts",
                                        "aimValue": 2,
                                        "curValue": 2
                                    },
                                    "map": "level_us_02_02_new",
                                    "platformId": "",
                                    "zones": [
                                        "US_02_02_BRIDGE_BUILD_01",
                                        "US_02_02_BRIDGE_BUILD_02"
                                    ],
                                    "isNeedVisitOnTruck": false,
                                    "modelBuildingTag": "",
                                    "truckUid": "",
                                    "unloadingMode": 0
                                }
                            ],
                            "truckRepairStates": [],
                            "makeActionInZone": null,
                            "visitAllZonesState": null,
                            "livingAreaState": null
                        }
                    ],
                    "failReasons": {}
                }
            },
            "visitedLevels": [
                "level_us_01_01",
                "level_us_02_01",
                "level_ru_02_02",
                "level_ru_03_01",
                "level_us_04_01",
                "level_us_03_01",
                "level_ru_04_01",
                "level_us_01_02",
                "level_us_01_04_new",
                "level_us_02_02_new",
                "level_us_01_03",
                "level_ru_03_02",
                "level_us_02_03_new",
                "level_us_02_04_new"
            ],
            "tutorialStates": {
                "TASKGIVER_DISCOVERED": true,
                "GARAGE_NAVIGATION": true,
                "REPAIR_FUNCTIONS": true,
                "TRUCK_DISCOVERED": true,
                "ENTER_TRUCKS_BEFORE_RETAIN": true,
                "REPAIR_POSSIBILITY": true,
                "SECOND_DAMAGE": true,
                "STUCK_AND_GO_TO_FUNCTIONS": true,
                "WAYPOINT_TOOL_MAP": true,
                "WATCHTOWER_OPEN_MAP": true,
                "UPGRADE_POPUP_LIST": true,
                "RIVER_APPROACH": true,
                "STUCK_AND_GO_TO_MAP": true,
                "ENTER_GLOBAL_MAP_WITH_RETAINED_TRUCK": true,
                "SELECT_TRUCK": true,
                "WAYPOINT_TOOL_MAP_CONTEXT": true,
                "FUEL_STATION_ON_MAP": true,
                "BRIDGE_MISSION": true,
                "CUSTOMIZE_GEARBOX": true,
                "CUSTOM_SCENARIO": false,
                "WATCHTOWER_OPENED_CONTRACT": true,
                "FIRST_CARGO_UNLOADING": true,
                "LEVEL_UP": true,
                "CRAFT": true,
                "ALASKA_MAP": true,
                "CUSTOMIZE_VISUALS": true,
                "BUILD_BRIDGE_OPENED": true,
                "TRAILER_STORE": true,
                "TRAILER_NEAR": true,
                "EXIT_ALASKA_GARAGE": true,
                "ACTIVATE_WINCH": true,
                "CHANGE_TRUCK": true,
                "ROAD_LOWGEAR": true,
                "UPGRADE_POPUP": true,
                "OPEN_ACTIVE_NOT_TRACKED_OBJECTIVE": true,
                "CHANGE_TRUCK_MAP": true,
                "LIGHTS": true,
                "GARAGE_COLLISION": true,
                "COMPLETE_FIRST_STAGE_BUILD_BRIDGE": true,
                "START": true,
                "WATCHTOWER_APPROACH": true,
                "EMPLOYER_BUTTON_PRESSED": true,
                "ENGINE_STARTED_SECOND": true,
                "WATCHPOINT_ADVICE": true,
                "ENTER_CUSTOMIZE": true,
                "REPAIR_MENU": true,
                "GENERATOR": true,
                "FIRST_ENTER_CRANE": true,
                "FIRST_MAP": true,
                "WATCHTOWER_OPENED_MAP": true,
                "FIRST_OPEN_MAP": true,
                "ENTER_PROFILE": true,
                "CUSTOMIZE_ENGINE": true,
                "ALASKA_GARAGE": true,
                "GLOBAL_MAP_SWITCHED_TO_ALASKA": true,
                "ENTER_GARAGE": true,
                "STUCK_SECOND_TIME": true,
                "FUEL_STATION_APPROACH": true,
                "BUILD_BRIDGE_TRACKED": true,
                "CONTRACTS_OPENED": true,
                "GATEWAY_APPROACH": true,
                "AWD": true,
                "TRUCK_RETAINED": true,
                "ENGINE_STARTED": true,
                "MAP_OPENED_FOR_NEXT_CONTRACT": true,
                "STUCK_THIRD_TIME": true,
                "LUMBERMILL_ADVICE": true,
                "STUCK_FOURTH_TIME": true,
                "REGIONAL_CONTRACTS": true,
                "ALASKA_TRUCK_DEPLOYED": true,
                "FIRST_CARGO_LOADING_2": true,
                "WATCHTOWER_OPENED": true,
                "CODEX": true,
                "APPROACH_TRAILER": true,
                "BUILD_BRIDGE_COMPLETED": true,
                "ALASKA_DEPLOY_TRUCK": true,
                "FIRST_DAMAGE": true,
                "TRAILER_STORE_APPROACH": true,
                "BRIDGE_OPEN_MAP": true,
                "OUT_OF_FUEL": true,
                "OPEN_MAP_FOR_NEXT_CONTRACT": true,
                "FIRST_CARGO_LOADING": true,
                "STUCK_FIRST_TIME": true,
                "RETAIN_TRUCK": true,
                "STUCK_WITH_DIFFLOCK": true,
                "CUSTOMIZE_SUSPENSION": true,
                "GARAGE_SLOT_CHANGED": true,
                "GARAGE_APPROACH": true,
                "TASKGIVER_APPROACH": true,
                "CONTRACT_COMPLETED": true,
                "LOWGEAR": true,
                "ENTER_TRUCK_STORE": true
            },
            "persistentProfileData": {
                "experience": 27010,
                "money": 82431,
                "trucksInWarehouse": [
                    {
                        "type": "krs_58_bandit",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "mudtires",
                        "tmBodies": [],
                        "engine": {
                            "name": "ru_truck_old_engine_0"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_truck_offroad"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_medium_trucks_ext"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": 31,
                            "overrideMaterialName": "skin_00",
                            "tintsColors": [
                                {
                                    "b": 98.000465393066406,
                                    "a": 0.0,
                                    "r": 233.00093078613281,
                                    "g": 157.0
                                },
                                {
                                    "b": 225.00093078613281,
                                    "a": 0.0,
                                    "r": 32.0,
                                    "g": 128.0
                                },
                                {
                                    "b": 74.0,
                                    "a": 0.0,
                                    "r": 27.000116348266602,
                                    "g": 201.00093078613281
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_medium_mudtires_actaeon",
                        "suspension": "krs_58_bandit_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.65000003576278687,
                        "phantomMode": 0,
                        "rims": "rim",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "sticker_inside_1x1_01_krs_58_bandit",
                                "isInCockpit": true,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "sticker_capote_1x1_krs_58_bandit",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": "skin_00"
                            },
                            {
                                "repairs": 0,
                                "name": "sticker_glass_bottom_krs_58_bandit",
                                "isInCockpit": true,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": "skin_01"
                            },
                            {
                                "repairs": 0,
                                "name": "krs_58_bandit_bumper_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "krs_58_bandit_gabarite_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "krs_58_bandit_visor_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "krs_58_bandit_snorkel_2",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 150,
                                "name": "krs_58_bandit_roofrack_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 140.0,
                                "extraParents": [],
                                "wheelRepairs": 2,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "frame_addon_flatbed_2",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": -1.3360000848770142,
                                    "y": 1.4079999923706055,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 150.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0,
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.09587530791759491,
                            -0.095737889409065247,
                            -0.081119291484355927,
                            -0.081148795783519745,
                            -0.059069018810987473,
                            -0.058671820908784866,
                            -0.043946869671344757,
                            -0.044816181063652039
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_us_02_01"
                    },
                    {
                        "type": "international_loadstar_1700",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "chains_all",
                        "tmBodies": [],
                        "engine": {
                            "name": "us_truck_old_engine_0"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_truck_offroad"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_scout_default"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": -1,
                            "overrideMaterialName": "",
                            "tintsColors": [
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                },
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                },
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_medium_double",
                        "suspension": "international_loadstar_1700_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.45000001788139343,
                        "phantomMode": 0,
                        "rims": "rim_1",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "international_loadstar_1700_bumper_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 150,
                                "name": "international_loadstar_1700_pickup",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 100.0,
                                "extraParents": [],
                                "wheelRepairs": 3,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "international_loadstar_1700_snorkel_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 130.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.16491322219371796,
                            -0.17031212151050568,
                            -0.036868501454591751,
                            -0.045668922364711761
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_us_02_01"
                    },
                    {
                        "type": "tuz_108_warthog",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "mudtires",
                        "tmBodies": [],
                        "engine": {
                            "name": "ru_truck_modern_engine_0"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_truck_default"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_medium_trucks_default"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": -1,
                            "overrideMaterialName": "",
                            "tintsColors": [
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                },
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                },
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_medium_mudtires_actaeon",
                        "suspension": "tuz_108_warthog_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.5,
                        "phantomMode": 0,
                        "rims": "rim",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "tuz_108_warthog_diff_lock_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "tuz_108_warthog_bumper_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "tuz_108_warthog_exhaust_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 150,
                                "name": "tuz_108_warthog_trunk",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 60.0,
                                "extraParents": [],
                                "wheelRepairs": 2,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "frame_addon_tank_small_short",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 600.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": -1.9800000190734863,
                                    "y": 1.1410000324249268,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 200.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.068444781005382538,
                            -0.06211455911397934,
                            -0.21162837743759155,
                            -0.20753428339958191
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_us_02_01"
                    },
                    {
                        "type": "tayga_6436",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "mudtires",
                        "tmBodies": [],
                        "engine": {
                            "name": "ru_truck_old_heavy_engine_0"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_truck_offroad"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_medium_trucks_default"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": 20,
                            "overrideMaterialName": "skin_00",
                            "tintsColors": [
                                {
                                    "b": 139.0,
                                    "a": 0.0,
                                    "r": 68.0,
                                    "g": 107.00038909912109
                                },
                                {
                                    "b": 139.0,
                                    "a": 0.0,
                                    "r": 68.0,
                                    "g": 107.00038909912109
                                },
                                {
                                    "b": 139.0,
                                    "a": 0.0,
                                    "r": 68.0,
                                    "g": 107.00038909912109
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_heavy_mudtires_tayga",
                        "suspension": "tayga_6436_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.60000002384185791,
                        "phantomMode": 0,
                        "rims": "rim",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "tayga_6436_bumper_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "tayga_6436_exhaust_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "tayga_6436_fender_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneCabin_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "tayga_6436_snorkel_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabinDamper_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "frame_addon_flatbed_2",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": -0.10000000149011612,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": -0.10000000149011612,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": -2.0,
                                    "y": 1.3940000534057617,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 330.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.14444085955619812,
                            -0.14184574782848358,
                            -0.1148991584777832,
                            -0.11795046180486679,
                            -0.11698950827121735,
                            -0.11935440450906754
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_us_02_01"
                    },
                    {
                        "type": "hummer_h2",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "chain_1",
                        "tmBodies": [],
                        "engine": {
                            "name": "us_scout_modern_engine_1"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_scout_default"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_scout_default"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": 30,
                            "overrideMaterialName": "skin_00",
                            "tintsColors": [
                                {
                                    "b": 143.0,
                                    "a": 0.0,
                                    "r": 82.0,
                                    "g": 128.0
                                },
                                {
                                    "b": 6.0000128746032715,
                                    "a": 0.0,
                                    "r": 210.00041198730469,
                                    "g": 70.0
                                },
                                {
                                    "b": 6.0000128746032715,
                                    "a": 0.0,
                                    "r": 210.00041198730469,
                                    "g": 70.0
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_scout2",
                        "suspension": "hummer_h2_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.45000001788139343,
                        "phantomMode": 0,
                        "rims": "rim_1",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "hummer_h2_bumper_front_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "hummer_h2_trunk_roof",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "hummer_h2_bumper_rear_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "hummer_h2_snorkel_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 150,
                                "name": "hummer_h2_roofrack",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 40.0,
                                "extraParents": [],
                                "wheelRepairs": 4,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 150,
                                "name": "hummer_h2_trunk",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 40.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "hummer_h2_diff_lock_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 80.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.083999887108802795,
                            -0.089106239378452301,
                            -0.070480629801750183,
                            -0.07627926766872406
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_us_02_03_new"
                    },
                    {
                        "type": "international_hx_520",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "chains_all",
                        "tmBodies": [],
                        "engine": {
                            "name": "us_truck_modern_engine_0"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_truck_offroad"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_medium_trucks_default"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": -1,
                            "overrideMaterialName": "",
                            "tintsColors": [
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                },
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                },
                                {
                                    "b": 0.0,
                                    "a": 0.0,
                                    "r": 0.0,
                                    "g": 0.0
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_medium_double",
                        "suspension": "international_hx_520_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.60000002384185791,
                        "phantomMode": 0,
                        "rims": "rim_1",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "international_hx_520_bumper_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "international_hx_520_visor_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "international_hx_520_exhaust_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "international_hx_520_transferbox_allwheels",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneTieRodRWD_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneTieRodLeftAWD_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneTieRodRightAWD_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneAxleFront",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneRackLeft",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneRackRight",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneRackRWD",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    },
                                    {
                                        "frame": "BoneRackAWD",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "international_hx_520_snorkel_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneCabin_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "international_hx_520_diff_lock",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "saddle_high",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0050000003539025784
                                        }
                                    },
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": -0.0050000003539025784
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": -5.2389998435974121,
                                    "y": 1.125,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 280.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.10961730778217316,
                            -0.11412566155195236,
                            -0.0060763726942241192,
                            -0.0054812012240290642,
                            -0.0052013196982443333,
                            -0.0049120048061013222
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_us_02_03_new"
                    },
                    {
                        "type": "khan_39_marshall",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "mudtires_2",
                        "tmBodies": [],
                        "engine": {
                            "name": "ru_scout_modern_engine_0"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_scout_offroad"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_scout_offline"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": 32,
                            "overrideMaterialName": "skin_01",
                            "tintsColors": [
                                {
                                    "b": 83.0,
                                    "a": 0.0,
                                    "r": 44.0,
                                    "g": 90.0
                                },
                                {
                                    "b": 83.0,
                                    "a": 0.0,
                                    "r": 44.0,
                                    "g": 90.0
                                },
                                {
                                    "b": 83.0,
                                    "a": 0.0,
                                    "r": 44.0,
                                    "g": 90.0
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_scout_yar_871",
                        "suspension": "khan_39_marshall_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.56000000238418579,
                        "phantomMode": 0,
                        "rims": "rim_1",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "khan_39_marshall_bumper_rear_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "khan_39_marshall_bumper_2",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "khan_39_marshall_arch_expander_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "khan_39_marshall_diff_lock_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "khan_39_marshall_wheel_addon_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [
                                    {
                                        "frame": "BoneChassis_cdt",
                                        "eulerAngles": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        },
                                        "position": {
                                            "x": 0.0,
                                            "y": 0.0,
                                            "z": 0.0
                                        }
                                    }
                                ],
                                "wheelRepairs": 1,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 0,
                                "name": "khan_39_marshall_snorkel_default",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            },
                            {
                                "repairs": 150,
                                "name": "khan_39_marshall_roofrack_1",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 80.0,
                                "extraParents": [],
                                "wheelRepairs": 4,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 40.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.10334538668394089,
                            -0.10557562112808228,
                            -0.10894265025854111,
                            -0.11147574335336685
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_ru_04_01"
                    },
                    {
                        "type": "cat_th357",
                        "damage": 0,
                        "wheelRepairs": 0,
                        "id": "",
                        "tires": "mudtires_1",
                        "tmBodies": [],
                        "engine": {
                            "name": "us_special_cat_th357_engine_0"
                        },
                        "isPacked": false,
                        "gearbox": {
                            "name": "g_special_default"
                        },
                        "isPoweredEngaged": [],
                        "winchUpgrade": {
                            "name": "w_scout_default"
                        },
                        "customizationPreset": {
                            "gameDataXmlNode": null,
                            "uiName": "",
                            "id": -1,
                            "overrideMaterialName": "",
                            "tintsColors": [
                                {
                                    "b": 255.0,
                                    "a": 0.0,
                                    "r": 255.0,
                                    "g": 255.0
                                },
                                {
                                    "b": 255.0,
                                    "a": 0.0,
                                    "r": 255.0,
                                    "g": 255.0
                                },
                                {
                                    "b": 255.0,
                                    "a": 0.0,
                                    "r": 255.0,
                                    "g": 255.0
                                }
                            ],
                            "isSpecialSkin": false
                        },
                        "itemForObjectiveId": "",
                        "wheelsType": "wheels_cat_th357_single",
                        "suspension": "cat_th357_suspension_default",
                        "isUnlocked": true,
                        "constraints": [],
                        "wheelsScale": 0.64800006151199341,
                        "phantomMode": 0,
                        "rims": "rim_1",
                        "addons": [
                            {
                                "repairs": 0,
                                "name": "crane_cat_th357_bigfork",
                                "isInCockpit": false,
                                "parentAddonType": "",
                                "fuel": 0.0,
                                "extraParents": [],
                                "wheelRepairs": 0,
                                "eulerAngles": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "parentFrame": "BoneChassis_cdt",
                                "firstSlot": -1,
                                "position": {
                                    "x": 0.0,
                                    "y": 0.0,
                                    "z": 0.0
                                },
                                "overrideMaterial": ""
                            }
                        ],
                        "globalId": "",
                        "fuel": 110.0,
                        "repairs": 0,
                        "wheelsDamage": [
                            0,
                            0,
                            0,
                            0
                        ],
                        "wheelsSuspHeight": [
                            -0.0045622601173818111,
                            -0.0056030522100627422,
                            -0.0078652650117874146,
                            -0.0025724659208208323
                        ],
                        "damageDecals": [],
                        "engineDamage": 0,
                        "fuelTankDamage": 0,
                        "gearboxDamage": 0,
                        "suspensionDamage": 0,
                        "trailerGlobalId": "",
                        "isInvalid": false,
                        "needToInstallDefaultAddons": false,
                        "retainedMapId": "level_us_01_02"
                    }
                ],
                "distance": {
                    "us_01": 256274,
                    "us_02": 67102,
                    "us_04": 6446,
                    "ru_02": 7180,
                    "ru_04": 1450,
                    "ru_03": 57389
                },
                "discoveredUpgrades": {
                    "level_us_02_02_new": {
                        "current": 1,
                        "all": 5
                    },
                    "level_us_02_03_new": {
                        "current": 1,
                        "all": 6
                    },
                    "level_ru_02_03": {
                        "current": 0,
                        "all": 6
                    },
                    "level_us_02_01": {
                        "current": 5,
                        "all": 8
                    },
                    "level_ru_04_02": {
                        "current": 0,
                        "all": 1
                    },
                    "level_ru_02_01_crop": {
                        "current": 0,
                        "all": 7
                    },
                    "level_us_01_01": {
                        "current": 6,
                        "all": 7
                    },
                    "test_zone_color_summer": {
                        "current": 0,
                        "all": 1
                    },
                    "level_us_04_01": {
                        "current": 0,
                        "all": 3
                    },
                    "level_us_04_02": {
                        "current": 0,
                        "all": 3
                    },
                    "level_us_03_01": {
                        "current": 0,
                        "all": 4
                    },
                    "level_ru_03_01": {
                        "current": 3,
                        "all": 5
                    },
                    "level_ru_02_04": {
                        "current": 0,
                        "all": 3
                    },
                    "level_us_03_02": {
                        "current": 0,
                        "all": 4
                    },
                    "level_us_01_02": {
                        "current": 5,
                        "all": 8
                    },
                    "level_ru_04_03": {
                        "current": 0,
                        "all": 1
                    },
                    "level_ru_02_02": {
                        "current": 0,
                        "all": 8
                    },
                    "level_us_01_04_new": {
                        "current": 2,
                        "all": 2
                    },
                    "test_zone_color_winter": {
                        "current": 0,
                        "all": 1
                    },
                    "level_us_01_03": {
                        "current": 4,
                        "all": 4
                    },
                    "level_ru_04_01": {
                        "current": 0,
                        "all": 1
                    },
                    "level_us_02_04_new": {
                        "current": 0,
                        "all": 4
                    },
                    "level_ru_03_02": {
                        "current": 2,
                        "all": 5
                    },
                    "level_ru_04_04": {
                        "current": 0,
                        "all": 2
                    }
                },
                "contestTimes": {},
                "contestAttempts": {},
                "discoveredTrucks": {
                    "test_zone_color_summer": {
                        "current": 0,
                        "all": 0
                    },
                    "level_us_01_01": {
                        "current": 5,
                        "all": 5
                    },
                    "level_ru_02_01_crop": {
                        "current": 0,
                        "all": 0
                    },
                    "level_trial_03_03": {
                        "current": 0,
                        "all": 2
                    },
                    "level_us_02_04_new": {
                        "current": 1,
                        "all": 2
                    },
                    "level_trial_03_02": {
                        "current": 0,
                        "all": 3
                    },
                    "level_us_test_polygon": {
                        "current": 0,
                        "all": 2
                    },
                    "level_us_03_01": {
                        "current": 0,
                        "all": 1
                    },
                    "level_trial_03_01": {
                        "current": 0,
                        "all": 2
                    },
                    "level_ru_03_01": {
                        "current": 2,
                        "all": 1
                    },
                    "level_trial_01_01": {
                        "current": 0,
                        "all": 1
                    },
                    "level_ru_03_02": {
                        "current": 1,
                        "all": 1
                    },
                    "level_us_01_02": {
                        "current": 2,
                        "all": 2
                    },
                    "level_us_03_02": {
                        "current": 0,
                        "all": 1
                    },
                    "level_ru_02_03": {
                        "current": 0,
                        "all": 1
                    },
                    "level_us_02_03_new": {
                        "current": 0,
                        "all": 0
                    },
                    "level_ru_04_02": {
                        "current": 0,
                        "all": 0
                    },
                    "level_us_02_01": {
                        "current": 4,
                        "all": 1
                    },
                    "test_zone_color_winter": {
                        "current": 0,
                        "all": 0
                    },
                    "level_tutorial_objectives": {
                        "current": 0,
                        "all": 0
                    },
                    "level_tutorial_upgrades": {
                        "current": 0,
                        "all": 0
                    },
                    "level_trial_02_01": {
                        "current": 0,
                        "all": 5
                    },
                    "level_trial_02_02": {
                        "current": 0,
                        "all": 1
                    },
                    "level_ru_02_02": {
                        "current": 2,
                        "all": 0
                    },
                    "level_us_01_03": {
                        "current": 0,
                        "all": 0
                    },
                    "level_ru_04_01": {
                        "current": 0,
                        "all": 0
                    },
                    "level_trial_05_01": {
                        "current": 0,
                        "all": 6
                    },
                    "level_us_04_01": {
                        "current": 3,
                        "all": 1
                    },
                    "level_tutorial_track": {
                        "current": 0,
                        "all": 0
                    },
                    "level_trial_01_02": {
                        "current": 0,
                        "all": 4
                    },
                    "level_us_04_02": {
                        "current": 0,
                        "all": 1
                    },
                    "level_us_02_02_new": {
                        "current": 1,
                        "all": 0
                    },
                    "level_ru_02_04": {
                        "current": 0,
                        "all": 0
                    },
                    "level_ru_04_03": {
                        "current": 0,
                        "all": 0
                    },
                    "level_trial_04_01": {
                        "current": 0,
                        "all": 1
                    },
                    "level_ru_test_polygon": {
                        "current": 0,
                        "all": 2
                    },
                    "level_us_01_04_new": {
                        "current": 1,
                        "all": 1
                    },
                    "level_trial_04_02": {
                        "current": 0,
                        "all": 1
                    },
                    "level_ru_04_04": {
                        "current": 0,
                        "all": 0
                    }
                },
                "addons": {
                    "us_truck_old_engine_4070": 1,
                    "khan_39_marshall_roofrack_1": 0,
                    "hummer_h2_trunk_roof": 0,
                    "cat_ct681_diff_lock_default": 0,
                    "chevrolet_kodiakc70_spare_wheel": 0,
                    "ford_f750_transferbox_allwheels": 0,
                    "g_truck_default": 0,
                    "international_loadstar_1700_pickup": 0,
                    "wheels_medium_mudtires_actaeon_mudtires_0.65": 0,
                    "w_mod_iryerfdog_battery": 0,
                    "saddle_high_royal_bm17": 1,
                    "frame_addon_flatbed_2": 0,
                    "trailer_log_pole": 0,
                    "us_scout_old_engine_f750": 0,
                    "us_scout_old_engine_ck1500": 1,
                    "bunk_log_addon": 0,
                    "frame_addon_sideboard_2": 1,
                    "g_truck_offroad": 0,
                    "khan_39_marshall_arch_expander_1": 0,
                    "cat_745c_log_bunk": 0,
                    "mod_scout_engine_1700MUDfrogc8": 0,
                    "frogc8mudwheel\\362792_highway_2_0.65": 0,
                    "sticker_capote_1x1_international_fleetstar_f2070a": 0,
                    "ws_6900xd_twin_spare_wheel": 0,
                    "khan_39_marshall_bumper_default": 1,
                    "ford_f750color30": 0,
                    "royal_bm17_snorkel_default": 0,
                    "saddle_pacific": 0,
                    "us_truck_modern_engine_1": 0,
                    "stuff_curtain_international_fleetstar_f2070a": 0,
                    "hummer_h2_roofrack": 0,
                    "saddle_low": 2,
                    "tayga_6436color32": 0,
                    "mod_scout_engine_MUDfrogc8": 0,
                    "wheels_ford_f750_offroad_3_0.57": 0,
                    "wheels_heavy_single_mudtires_1_0.7": 0,
                    "international_hx_520_transferbox_allwheels": 0,
                    "mod_scout_engine_frogc8crawlperformance": 1,
                    "scout_trailer_radar": 1,
                    "international_paystar_5070_suspension_high": 1,
                    "g_scout_default": 1,
                    "frame_addon_seismic_vibrator": 1,
                    "g_scout_offroad": 0,
                    "hummer_h2color30": 0,
                    "wheels_medium_double_front_highway_1_0.65": 0,
                    "us_special_engine_0": 1,
                    "khan_39_marshallcolor32": 0,
                    "wheels_medium_double_chains_all_0.5": 0,
                    "us_truck_modern_engine_cat_royal": 1,
                    "international_fleetstar_f2070a_diff_lock_default": 0,
                    "tayga_6436color20": 0,
                    "us_scout_old_engine_0": 0,
                    "wheels_medium_double_allterrain_3_0.6": 0,
                    "royal_bm17_snorkel_1": 0,
                    "frame_addon_log_short": 1,
                    "ford_f750_suspension_ultimate": 0,
                    "sticker_glass_bottom_krs_58_bandit": 0,
                    "frogc8_roof\\362792": 0,
                    "semitrailer_oiltank": 4,
                    "cat_ct681_transferbox_allwheels": 0,
                    "ford_f750_bumper_2": 0,
                    "ru_scout_old_engine_0": 1,
                    "international_fleetstar_f2070a_transferbox_allwheels": 0,
                    "us_special_engine_1": 0,
                    "chevrolet_kodiak_c70_transferbox_default": 0,
                    "mod_scout_engine_frogc8crawl": 1,
                    "wheels_medium_double_allterrain_3_0.5": 0,
                    "krs_58_bandit_bumper_default": 0,
                    "ford_f750_snorkel_1": 0,
                    "trailer_flatbed_ramps_4": 1,
                    "trailer_log": 0,
                    "khan_39_marshall_bumper_2": 0,
                    "ford_f750_transferbox_default": 0,
                    "ford_f750_pickup_rooftrunk": 0,
                    "g_mod_iryerfdog_mo_gears": 0,
                    "saddle_low_1": 3,
                    "us_truck_modern_engine_0": 0,
                    "krs_58_bandit_roofrack_1": 0,
                    "cat_770g_saddle": 1,
                    "big_crane_ru": 0,
                    "ru_scout_modern_engine_0": 0,
                    "w_mod_iryerfdog_default": 1,
                    "wheels_heavy_double2_offroad_3_0.7": 1,
                    "ws_4964_white_diff_lock": 1,
                    "saddle_high": 0,
                    "wheels_scout2_mudtires_1_0.2": 0,
                    "wheels_heavy_single_allterrain_1_0.7": 0,
                    "frame_addon_tank": 1,
                    "crane_krs_58_bandit": 1,
                    "cat_745c_wires": 1,
                    "wheels_heavy_single_chains_1_0.6": 0,
                    "frogc8mudwheel\\362792_highway_1_0.65": 0,
                    "sticker_inside_1x1_01_krs_58_bandit": 0,
                    "wheels_medium_double_front_chains_all_0.55": 0,
                    "wheels_medium_mudtires_actaeon_mudtires_0.55": 0,
                    "semitrailer_stepdeck_plane_01": 0,
                    "wheels_medium_double_front_chains_all_0.65": 0,
                    "us_truck_old_heavy_engine_1": 0,
                    "wheels_heavy_single_offroad_1_0.6": 0,
                    "wheels_medium_double_highway_1_0.5": 0,
                    "wheels_medium_double_highway_1_0.55": 0,
                    "frogc8crawlwheel\\362792_offroad_2_0.65": 0,
                    "tayga_6436_snorkel_3": 0,
                    "us_truck_old_heavy_engine_0": 0,
                    "wheels_medium_double_highway_1_0.45": 0,
                    "royal_bm17color32": 0,
                    "wheels_medium_double_chains_all_0.55": 0,
                    "wheels_ford_f750_chains_all_0.57": 0,
                    "tuz_108_warthog_trunk": 0,
                    "ws_6900xd_twin_transferbox_default": 0,
                    "ws_6900xd_twin_transferbox_allwheels": 0,
                    "hummer_h2_spare_wheel": 1,
                    "tayga_6436color29": 0,
                    "wheels_medium_double_front_highway_1_0.5": 0,
                    "international_loadstar_1700_snorkel_1": 0,
                    "wheels_ford_f750_highway_ford_f750_0.47": 0,
                    "big_crane_us": 0,
                    "international_fleetstar_f2070acolor15": 0,
                    "tayga_6436_snorkel_1": 0,
                    "fleetstar_f2070a_suspension_high": 1,
                    "us_scout_modern_engine_1": 0,
                    "wheels_medium_double_chains_all_0.45": 0,
                    "scout_trailer_oiltank": 5,
                    "w_scout_offline": 0,
                    "minicrane_ru": 0,
                    "international_fleetstar_f2070a_exhaust_default": 0,
                    "trailer_flatbed_2": 3,
                    "mod_scout_engine_frogc8crawlupgrade": 0,
                    "ford_f750_bumper_default": 0,
                    "international_hx_520_transferbox_default": 0,
                    "krs_58_bandit_visor_1": 0,
                    "wheels_medium_double_front_chains_all_0.5": 0,
                    "wheels_medium_mudtires_actaeon_mudtires_0.5": 0,
                    "international_hx_520_diff_lock": 0,
                    "w_medium_trucks_ext": 0,
                    "krs_58_banditcolor31": 0,
                    "pacific_p16color29": 0,
                    "ws_4964_white_transferbox_allwheels": 1,
                    "ford_f750_suspension_default": 0,
                    "krs_58_bandit_gabarite_default": 0,
                    "international_fleetstar_f2070a_fender_default": 1,
                    "freightliner_m916a1_suspension_high": 1,
                    "tuz_16_actaeon_roofrack_1": 0,
                    "tayga_6436_wheel_addon": 1,
                    "wheels_medium_double_offroad_3_0.45": 0,
                    "cat_ct680_transferbox_allwheels": 1,
                    "wheels_medium_double_front_offroad_3_0.55": 0,
                    "cat_ct681color29": 0,
                    "trailer_service_2": 4,
                    "e_mod_iryerfdog_default": 0,
                    "wheels_medium_double_highway_1_0.6": 0,
                    "w_medium_trucks_pow": 0,
                    "wheels_scout2_chain_1_0.45": 0,
                    "cat_ct681_snorkel_1": 0,
                    "chevrolet_kodiakC70_suspension_default": 0,
                    "wheels_heavy_double1_highway_1_0.6": 0,
                    "scout_trailer_flatbed_2": 3,
                    "sticker_capote_1x1_krs_58_bandit": 0,
                    "frogc8crawlwheel\\362792_offroad_1_0.55": 1,
                    "trailer_sideboard_2": 8,
                    "minicrane_us": 1,
                    "trailer_addon_maintainer": 0,
                    "ford_f750_trunk": 0,
                    "chevrolet_kodiakC70_suspension_high": 0,
                    "wheels_heavy_mudtires_tayga_mudtires_0.6": 0,
                    "international_hx_520_diff_lock_default": 0,
                    "international_fleetstar_f2070acolor30": 0,
                    "trailer_oiltank": 4,
                    "frame_addon_kung": 1,
                    "wheels_medium_double_offroad_3_0.5": 0,
                    "international_fleetstar_f2070a_bumper_default": 0,
                    "gmc_9500_diff_lock": 1,
                    "wheels_ford_f750_offroad_2_0.57": 0,
                    "semitrailer_gooseneck_4": 0,
                    "us_scout_modern_engine_0": 0,
                    "international_fleetstar_f2070a_transferbox_default": 0,
                    "cat_770g_tank": 0,
                    "ford_f750_rooftrunk_1": 0,
                    "cat_ct681_diff_lock": 0,
                    "saddle_low_royal_bm17": 1,
                    "ru_scout_old_engine_tuz": 0,
                    "tuz_108_warthog_spot_light_default": 0,
                    "wheels_medium_double_front_allterrain_3_0.65": 0,
                    "wheels_heavy_single_allterrain_1_0.6": 0,
                    "cat_ct681_transferbox_default": 0,
                    "gmc_9500_transferbox_allwheels": 1,
                    "scout_trailer_flatbed_1": 1,
                    "w_scout_default": 2,
                    "hummer_h2_trunk": 0,
                    "cat_745c_container_carrier": 0,
                    "sticker_inside_1x1_01_international_fleetstar_f2070a": 0,
                    "wheels_scout_offroad2_hummer_h2_tire1_0.46": 0,
                    "semitrailer_flatbed_5": 1,
                    "semitrailer_sideboard_5": 2,
                    "ford_f750_pickup": 0,
                    "hummer_h2_snorkel_1": 0,
                    "wheels_medium_double_chains_all_0.6": 0,
                    "wheels_mod_iryerfdog\\133312_iryerfdogtire_1_0.2": 1,
                    "us_scout_old_engine_1": 0,
                    "us_scout_old_engine_2": 1,
                    "wheels_medium_double_offroad_3_0.6": 0,
                    "e_mod_iryerfdog_subaru": 0,
                    "chevrolet_ck1500_suspension_high": 1,
                    "us_truck_old_engine_clt": 1,
                    "krs_58_bandit_snorkel_2": 0,
                    "frame_addon_tank_small_short": 0,
                    "chevrolet_ck1500_diff_lock": 1,
                    "wheels_medium_double_allterrain_2_0.6": 0,
                    "g_mod_iryerfdog_default": 0,
                    "gmc9500_suspension_high": 1,
                    "chevrolet_kodiak_c70_transferbox_allwheels": 0,
                    "w_medium_trucks_default": 0,
                    "chevrolet_kodiakc70_snorkel_1": 0,
                    "gmc_9500color27": 0
                },
                "unlockedItemNames": {
                    "scout_trailer_flatbed_2": false,
                    "ank_mk38": false,
                    "international_fleetstar_f2070a": false,
                    "ws_4964_white_diff_lock": false,
                    "trailer_flatbed_ramps_4": false,
                    "us_scout_modern_engine_1": false,
                    "yar_87": false,
                    "fleetstar_f2070a_suspension_high": false,
                    "trailer_oiltank": false,
                    "krs_58_bandit_horn_2": false,
                    "us_truck_old_heavy_engine_1": false,
                    "chevrolet_kodiakc70": false,
                    "cat_ct680_transferbox_allwheels": false,
                    "chevrolet_kodiakc70_bumper_03": false,
                    "cat_th357": false,
                    "chevrolet_ck1500_diff_lock": false,
                    "gmc9500_suspension_high": false,
                    "pacific_p16": false,
                    "frame_addon_kung": false,
                    "scout_trailer_radar": false,
                    "ws_4964_white_transferbox_allwheels": false,
                    "krs_58_bandit_snorkel_2": false,
                    "trailer_sideboard_2": false,
                    "international_fleetstar_f2070a_transferbox_allwheels": false,
                    "us_special_engine_1": false,
                    "tuz_108_warthog": false,
                    "chevrolet_kodiakC70_suspension_high": false,
                    "international_fleetstar_f2070a_bumper_2": false,
                    "international_transtar_4070a": false,
                    "g_scout_offroad": false,
                    "international_paystar_5070_suspension_high": false,
                    "cat_ct681_spot_light_2": false,
                    "ws_6900xd_twin_transferbox_allwheels": false,
                    "frame_addon_tank": false,
                    "hummer_h2": false,
                    "trailer_flatbed_2": false,
                    "international_scout_800": false,
                    "cat_745c": false,
                    "ford_f750": false,
                    "chevrolet_ck1500_suspension_high": false,
                    "ford_f750_transferbox_allwheels": false,
                    "us_scout_old_engine_ck1500": false,
                    "us_scout_old_engine_f750": false,
                    "cat_ct681_gabarite_2": false,
                    "tuz_166": false,
                    "chevrolet_kodiak_c70_transferbox_allwheels": false,
                    "semitrailer_flatbed_5": false,
                    "cat_ct680": false,
                    "royal_bm17": false,
                    "gmc_9500_diff_lock": false,
                    "gmc_9500_transferbox_allwheels": false,
                    "chevrolet_ck1500": false,
                    "cat_ct681_exhaust_2": false,
                    "g_truck_offroad": false,
                    "us_truck_old_engine_clt": false,
                    "cat_770g": false,
                    "cat_ct681_visor_2": false,
                    "us_truck_modern_engine_1": false,
                    "semitrailer_sideboard_5": false,
                    "gmc_9500": false,
                    "semitrailer_oiltank": false,
                    "trailer_addon_maintainer": false,
                    "tayga_6436": false,
                    "ford_f750_suspension_ultimate": false,
                    "scout_trailer_flatbed_1": false,
                    "freightliner_m916a1_suspension_high": false,
                    "us_truck_old_engine_4070": false,
                    "azov_5319": false,
                    "us_scout_old_engine_1": false,
                    "us_scout_old_engine_2": false,
                    "ford_f750_horn_2": false,
                    "krs_58_bandit_snorkel_1": false,
                    "tuz_16_actaeon": false,
                    "scout_trailer_oiltank": false,
                    "trailer_service_2": false
                },
                "knownRegions": [
                    "us_01",
                    "us_02",
                    "ru_02",
                    "ru_03",
                    "us_04",
                    "us_03",
                    "ru_04"
                ],
                "dlcNotes": [
                    "khan39marshall_khan_39_marshall_0",
                    "expand_and_explore_krs_58_bandit_0",
                    "cat681_hx520_cat_ct681_0",
                    "cat681_hx520_international_hx_520_0"
                ],
                "refundGarageTruckDescs": [],
                "damagableAddons": {},
                "rank": 16,
                "newTrucks": [
                    "chevrolet_ck1500",
                    "international_fleetstar_f2070a",
                    "chevrolet_kodiakc70",
                    "international_transtar_4070a",
                    "tuz_108_warthog",
                    "ank_mk38"
                ],
                "refundMoney": 0,
                "refundTruckDescs": {},
                "ownedTrucks": {
                    "ford_f750": 1,
                    "ws_6900xd_twin": 1,
                    "cat_745c": 1,
                    "hummer_h2": 1,
                    "cat_ct681": 1,
                    "international_hx_520": 1,
                    "tuz_108_warthog": 1,
                    "krs_58_bandit": 1,
                    "cat_770g": 1,
                    "ank_mk38": 1,
                    "international_loadstar_1700": 1,
                    "tuz_16_actaeon": 1,
                    "chevrolet_ck1500": 1,
                    "khan_39_marshall": 1,
                    "cat_th357": 1,
                    "chevrolet_kodiakc70": 1,
                    "pacific_p16": 1,
                    "royal_bm17": 1,
                    "tayga_6436": 1,
                    "gmc_9500": 1
                },
                "userId": {}
            },
            "worldConfiguration": "vanilla",
            "modTruckTypesRefundValues": {},
            "trackedObjective": "US_02_04_LOST_CARGO_TSK",
            "gameStat": {
                "SESSION_NUMBER": 42,
                "MONEY_SPENT": 858635,
                "TRAILER_BOUGHT": 11,
                "TRUCK_BOUGHT": 10,
                "MULTIPLAYER_MISSIONS_FINISHED": 48,
                "TRAILER_SOLD": 15,
                "ADDON_BOUGHT": 121,
                "ADDON_SOLD": 77,
                "MULTIPLAYER_SESSIONS_PLAYED": 10,
                "MULTIPLAYER_MONEY_EARNED": 137500,
                "MONEY_EARNED": 904266,
                "TRUCK_SOLD": 17
            },
            "birthVersion": 6,
            "levelGarageStatuses": {
                "level_us_02_02_new": 0,
                "level_us_02_03_new": 2,
                "level_ru_02_03": 1,
                "level_us_02_01": 2,
                "level_ru_04_02": 1,
                "level_ru_02_01_crop": 0,
                "level_us_01_01": 2,
                "level_us_04_01": 2,
                "level_us_04_02": 1,
                "level_us_03_01": 2,
                "level_ru_03_01": 2,
                "level_ru_02_04": 0,
                "level_us_03_02": 1,
                "level_us_01_02": 2,
                "level_ru_04_03": 0,
                "level_ru_02_02": 2,
                "level_us_01_04_new": 0,
                "level_us_01_03": 0,
                "level_ru_04_01": 2,
                "level_us_02_04_new": 0,
                "level_ru_03_02": 1,
                "level_ru_04_04": 1
            },
            "gameStatByRegion": {
                "PAYMENTS_RECEIVED": {
                    "us_01": 134100,
                    "us_02": 45200,
                    "us_04": 9900,
                    "ru_02": 3750,
                    "ru_03": 11400
                }
            },
            "saveId": 1,
            "modTruckOnLevels": {
                "level_us_02_02_new": [],
                "level_us_02_04_new": [],
                "level_us_01_01": [],
                "level_us_02_01": [],
                "level_us_02_03_new": [],
                "level_ru_03_01": [],
                "level_us_01_04_new": [],
                "level_ru_02_02": [],
                "level_ru_03_02": [],
                "level_us_01_02": [],
                "level_us_04_01": [],
                "level_us_01_03": [],
                "level_ru_04_01": []
            },
            "lastLoadedLevel": "level_us_02_04_new",
            "lastLevelState": 1,
            "garagesData": {
                "level_us_01_02": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                },
                "level_ru_02_02": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                },
                "level_us_04_01": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                },
                "level_ru_03_01": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                },
                "level_ru_04_01": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                },
                "level_us_02_03_new": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                },
                "level_us_02_01": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                },
                "level_us_01_01": {
                    "slotsDatas": {
                        "garage_interior_slot_1": {
                            "garageSlotZoneId": "garage_interior_slot_1",
                            "truckDesc": null
                        },
                        "garage_interior_slot_3": {
                            "garageSlotZoneId": "garage_interior_slot_3",
                            "truckDesc": null
                        },
                        "garage_interior_slot_2": {
                            "garageSlotZoneId": "garage_interior_slot_2",
                            "truckDesc": null
                        },
                        "garage_interior_slot_6": {
                            "garageSlotZoneId": "garage_interior_slot_6",
                            "truckDesc": null
                        },
                        "garage_interior_slot_5": {
                            "garageSlotZoneId": "garage_interior_slot_5",
                            "truckDesc": null
                        },
                        "garage_interior_slot_4": {
                            "garageSlotZoneId": "garage_interior_slot_4",
                            "truckDesc": null
                        }
                    },
                    "selectedSlot": "garage_interior_slot_1"
                }
            },
            "gameTime": 11.756484985351563,
            "isHardMode": false,
            "metricSystem": 0,
            "savedCargoNeedToBeRemovedOnRestart": {
                "RU_03_02_TANK_CNT": [
                    "CargoBA20",
                    "CargoBA20Add"
                ]
            },
            "justDiscoveredObjects": {},
            "hiddenCargoes": {
                "RU_03_02_TANK_CNT": [
                    "CargoBA20",
                    "CargoBA20Add"
                ]
            },
            "modTruckRefundValues": {
                "{A8077BC5-9476-4846-B9FC-4E3F2BA19EC9}": 61979,
                "{B7A89A2C-CFAF-4607-926A-203356229798}": 62789
            },
            "givenTrialRewards": [],
            "discoveredObjectives": [
                "US_01_01_LOST_CARGO_TSK",
                "US_01_01_WOODEN_ORDER_CNT",
                "US_01_01_FALLEN_POWER_LINES_TSK",
                "US_01_01_MOTEL_NEEDS_TSK",
                "US_02_01_BAGS_ON_ICE_TSK",
                "US_02_01_STUCK_SCOUT_TSK",
                "US_02_01_CONTAINERS_IN_RIVER_TSK",
                "US_02_01_HUMMER_TSK",
                "US_02_01_RADIOSTATION_TSK",
                "US_02_01_OILTANK_DELIVERY_TSK",
                "US_02_01_LOST_TUBE_TSK",
                "US_02_01_ABANDONED_SUPPLIES_TSK",
                "US_02_01_MOUNTAIN_CONQUEST_2_CNT",
                "US_02_01_SERVICE_RETURN_TSK",
                "US_01_01_LANDSLIDE_TSK",
                "US_01_01_STUCK_TRAILER_TSK",
                "US_01_01_BOATMAN_TOOLS_DELIVERY_TSK",
                "US_01_01_SWAMP_EXPLORATION_TSK",
                "US_01_01_MISSED_OILTANK_TSK",
                "US_01_01_ROAD_BLOCKAGE_TSK",
                "US_01_01_LOCAL_ENTERTAINMENT_TSK",
                "US_01_01_METEO_DATA_CNT",
                "US_01_01_MOUNTAIN_BRIDGE_TSK",
                "US_01_01_THE_PLACE_BEYOND_THE_SPRUCES_TSK",
                "US_01_01_DROWNED_TRUCK_01_TSK",
                "US_01_01_FOOD_DELIVERY_CNT",
                "US_01_01_DROWNED_TRUCK_02_TSK",
                "US_01_01_KING_OF_HILLS_TSK",
                "US_01_02_FALLEN_ROCKS_TSK",
                "US_01_02_WOODEN_BRIDGE_TSK",
                "US_01_02_UNLUCKY_FISHERMAN_TSK",
                "US_01_02_LOST_TRAILER_TSK",
                "US_01_02_BARRELS_DELIVERY_TSK",
                "US_01_02_FOOD_FOR_WORKERS_TSK",
                "US_01_02_FARMERS_NEEDS_CNT",
                "US_01_02_CLEAR_ROCKS_01_TSK",
                "US_01_02_CLEAN_THE_RIVER_WEST_TSK",
                "US_01_02_TRUCK_RESTORATION_TSK",
                "US_01_02_CLEAN_THE_RIVER_EAST_TSK",
                "US_01_02_FIND_THE_ANTENNA_TOWER_TSK",
                "US_01_04_BUILD_A_BRIDGE_OBJ_1",
                "US_01_02_DRILL_FOR_OUTCAST_TSK",
                "US_01_02_HOUSE_RENOVATION_CNT",
                "US_01_04_BUILD_A_BRIDGE_OBJ_2",
                "US_01_04_EXPLORING_CNT",
                "US_01_02_RIVER_CROSSING_TSK",
                "US_01_02_SOLID_FOUNDATION_TSK",
                "US_01_02_LOST_BAGS_TSK",
                "US_02_01_FIX_A_BRIDGE_TSK",
                "US_02_01_POWERLINE_CHECK_TSK",
                "US_02_01_STONE_FALL_TSK",
                "US_02_01_EMPLOYEE_DISLOCATION_CNT",
                "US_02_01_TRAILER_PARK_TSK",
                "US_02_01_ROCK_FALL_TSK",
                "RU_02_02_LOST_CARGO_01_TSK",
                "RU_02_02_DAMAGED_TRUCK_04_TSK",
                "US_02_01_ROCK_TSK",
                "US_02_02_BRIDGE_RECOVERY_TSK",
                "US_02_02_WORKING_STIFF_TSK",
                "US_02_02_BRICKS_ON_RIVER_TSK",
                "RU_03_01_NORTH_RIVER_RACE_CNT",
                "RU_03_01_SNOWED_IN_TSK",
                "RU_03_01_FOREIGNER_TSK",
                "RU_03_01_CAMP_RESUPPLY_TSK",
                "RU_03_01_VILLAGE_SCOUTING_TSK",
                "RU_03_01_RURAL_SPELUNKER_TSK",
                "RU_03_01_CAMP_ROUTE_CHECK_TSK",
                "US_04_01_TSK_CAT",
                "US_04_01_TSK_07",
                "US_04_01_TSK_BRIDGE_03",
                "US_04_01_TSK_13",
                "US_04_01_TSK_ROCKS_01",
                "US_04_01_TSK_FORKLIFT",
                "US_04_01_TSK_BRIDGE_01",
                "RU_03_01_CAMP_GAS_DELIVEY_TSK",
                "US_01_01_DROWNED_TRUCK_03_TSK",
                "US_01_01_WOODEN_BRIDGE_TSK",
                "RU_03_01_ANTIQUE_TRUCK_HUNT_TSK",
                "RU_03_01_HELI_CARGO_RECOVERY_TSK",
                "RU_03_01_OFF_THE_RAILS_CNT",
                "RU_03_01_BASE_SUPPLIES_TSK",
                "RU_03_01_POWERLINE_3_REPAIR_TSK",
                "RU_03_01_LOG_CABIN_REPAIR_TSK",
                "RU_03_01_FACTORY_CHECK_TSK",
                "RU_03_01_ON_THIN_ICE_TSK",
                "RU_03_01_METEO_CHECK_TSK",
                "US_01_02_REPAIR_THE_TRUCK_TSK",
                "US_01_02_MICHIGAN_TRIAL_TSK",
                "US_01_03_SHORT_CUT_TSK",
                "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_02",
                "US_01_03_TRUCK_REPAIR",
                "US_01_03_BARREL_CNT",
                "US_01_03_SWAMP_CROSSING_03_TSK",
                "US_01_03_FIX_THE_ANTENNA_TSK",
                "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_03",
                "US_01_03_DROPPED_VEHICLE_SEARCHING_TSK_01",
                "US_01_03_SWAMP_CROSSING_02_TSK",
                "US_01_03_SWAMP_CROSSING_01_TSK",
                "US_01_03_FIND_THE_ANTENNA_TSK",
                "US_01_04_PATH__PASSING_TSK",
                "US_01_04_LOST_CARGO_DELIVERY_TSK",
                "US_01_04_LOST_SHIP_OBJ",
                "US_01_04_BUILD_A_BRIDGE_OBJ_3",
                "US_01_04_OBSERVATION_DECK_TSK",
                "RU_03_02_ANTIQUES_TSK",
                "RU_03_02_LIGHTHOUSE_TSK",
                "RU_02_02_STUCK_TRUCK_TSK",
                "RU_02_02_DAMAGED_TRUCK_02_TSK",
                "RU_02_02_STUCK_TRUCK_03_TSK",
                "RU_02_02_FLAG_2_CNT",
                "RU_02_02_LOST_CARGO_03_TSK",
                "RU_02_02_DAMAGED_TRUCK_03_TSK",
                "RU_02_02_LOST_CARGO_05_TSK",
                "RU_02_02_DAMAGED_TRUCK_01_TSK",
                "RU_04_01_BRIDGE_02_TSK",
                "RU_04_01_EXPEDITION_TSK",
                "RU_04_01_CARGOCULT_TSK",
                "RU_04_01_FUELTASK_TSK",
                "RU_04_01_ROCKSLIDE_01_TSK",
                "RU_04_01_TRUCK_ON_HILL_TSK",
                "RU_04_01_BRIDGE_01_TSK",
                "RU_04_01_LOST_TRAILER_TSK",
                "RU_04_01_SCOUT_IN_TROUBLE_TSK",
                "RU_04_01_ROCKSLIDE_02_TSK",
                "RU_03_02_VILLAGE_TSK",
                "RU_03_02_OLD_SHIP_TSK",
                "RU_03_02_LANDSLIDE_1_TSK",
                "RU_03_02_WAREHOUSE_TSK",
                "RU_03_02_GARBAGE_CNT",
                "RU_03_02_FISHERCAMP_TSK",
                "RU_03_02_GARAGE_REPAIR_TSK",
                "RU_03_02_LANDSLIDE_2_TSK",
                "US_02_02_TO_THE_TOWER_CNT",
                "US_02_03_DERRY_LONGHORN_TSK",
                "US_02_03_REPAIR_THE_BRIDGE_TSK",
                "US_02_03_LONG_BRIDGE_RECOVERY_TSK",
                "US_02_03_SCOUT_IN_TROUBLE_TSK",
                "US_02_03_FAILED_FISHING_A_TSK",
                "US_02_03_BLOCKED_TUNNEL_TSK",
                "US_02_04_MOUNTAIN_CLEANING_TSK",
                "US_02_04_BRIDGE_BUILDING_TSK",
                "US_02_04_MATERIAL_DELIVERYING_TSK",
                "US_02_04_LOST_CARGO_TSK"
            ],
            "viewedUnactivatedObjectives": [
                "US_01_01_WOODEN_ORDER_CNT",
                "US_01_01_METEO_DATA_CNT",
                "US_01_02_FARMERS_NEEDS_CNT",
                "US_01_02_HOUSE_RENOVATION_CNT",
                "US_02_04_PIPELINE_BUILDING_CNT",
                "US_02_04_SERVICE_HUB_REACTIVATION_CNT",
                "US_02_04_LOGS_01_OBJ",
                "RU_03_01_NORTH_RIVER_RACE_CNT",
                "RU_03_02_BUNKER_CNT",
                "US_01_01_FOOD_DELIVERY_CNT",
                "US_01_03_BARREL_CNT",
                "US_01_04_EXPLORING_CNT",
                "US_01_02_FUEL_ORDER_OBJ",
                "US_02_01_MOUNTAIN_CONQUEST_2_CNT",
                "RU_03_01_OFF_THE_RAILS_CNT",
                "RU_03_02_GARBAGE_CNT",
                "US_02_01_EMPLOYEE_DISLOCATION_CNT",
                "US_02_02_TO_THE_TOWER_CNT"
            ],
            "objectivesValidated": true,
            "watchPointsData": {
                "data": {
                    "level_us_02_02_new": {
                        "US_02_02_WP_03": false,
                        "US_02_02_WP_02": true,
                        "US_02_02_WP_01": false
                    },
                    "level_ru_02_01_crop": {
                        "WATCHPOINT_HILL_SOUTH": false,
                        "WATCHPOINT_HILL_EAST": false,
                        "WATCHPOINT_SWAMP_EAST": false,
                        "WATCHPOINT_CHURCH_NORTH": false,
                        "WATCHPOINT_HILL_SOUTHWEST": false,
                        "WATCHPOINT_CLIFFSIDE_WEST": false
                    },
                    "level_us_01_01": {
                        "US_01_01_W9": false,
                        "US_01_01_W1": true,
                        "US_01_01_W3": true,
                        "US_01_01_W4": true,
                        "US_01_01_W5": true,
                        "US_01_01_W8": true,
                        "US_01_01_W7": true,
                        "US_01_01_W6": true
                    },
                    "level_us_02_03_new": {
                        "US_02_03_WP_04": false,
                        "US_02_03_WP_01": true,
                        "US_02_03_WP_05": false,
                        "US_02_03_WP_03": true,
                        "US_02_03_WP_02": false
                    },
                    "level_ru_02_03": {
                        "RU_02_03_WATCHPOINT_1": false,
                        "RU_02_03_WATCHPOINT_3": false,
                        "RU_02_03_WATCHPOINT_2": false
                    },
                    "level_us_02_01": {
                        "US_02_01_WP_04": true,
                        "US_02_01_WP_03": true,
                        "US_02_01_WP_02": true,
                        "US_02_01_WP_01": true
                    },
                    "level_ru_04_02": {
                        "RU_04_02_WATCHTOWER_02": false,
                        "RU_04_02_WATCHTOWER_05": false,
                        "RU_04_02_WATCHTOWER_04": false,
                        "RU_04_02_WATCHTOWER_03": false,
                        "RU_04_02_WATCHTOWER_01": false
                    },
                    "level_us_04_01": {
                        "US_04_01_WT_02": false,
                        "US_04_01_WT_03": false,
                        "US_04_01_WT_01": false,
                        "US_04_01_WT_04": false
                    },
                    "level_us_04_02": {
                        "US_04_02_W2": false,
                        "US_04_02_W5": false,
                        "US_04_02_W1": false,
                        "US_04_02_W4": false,
                        "US_04_02_W3": false,
                        "US_04_02_W7": false,
                        "US_04_02_W6": false
                    },
                    "level_us_03_01": {
                        "US_03_01_WP_03": false,
                        "US_03_01_WP_02": false,
                        "US_03_01_WP_01": false
                    },
                    "level_ru_03_01": {
                        "RU_03_01_WATCHPOINT_0": false,
                        "RU_03_01_WATCHPOINT_1": true,
                        "RU_03_01_WATCHPOINT_2": true
                    },
                    "level_ru_02_04": {
                        "WATCHPOINT_FARM_NORTH": false,
                        "WATCHPOINT_MINES_NORTH": false,
                        "WATCHPOINT_MOUNTAIN_SOUTH": false,
                        "WATCHPOINT_SHORE_SOUTH": false
                    },
                    "level_us_03_02": {
                        "US_03_02_W1": false,
                        "US_03_02_W5": false,
                        "US_03_02_W3": false,
                        "US_03_02_W2": false,
                        "US_03_02_W4": false
                    },
                    "level_us_01_02": {
                        "US_01_02_W7": false,
                        "US_01_02_W3": true,
                        "US_01_02_W4": true,
                        "US_01_02_W2": true,
                        "US_01_02_W1": true,
                        "US_01_02_W5": true
                    },
                    "level_ru_04_03": {
                        "WATCHPOINT_SE": false,
                        "WATCHPOINT_W": false,
                        "WATCHPOINT_C": false
                    },
                    "level_ru_02_02": {
                        "RU_02_02_W1": false,
                        "RU_02_02_W3": false,
                        "RU_02_02_W2": true
                    },
                    "level_us_01_04_new": {
                        "US_01_04_W3": true,
                        "US_01_04_W2": true,
                        "US_01_04_W4": true,
                        "US_01_04_W1": true
                    },
                    "level_us_01_03": {
                        "US_01_03_W1": true,
                        "US_01_03_W6": true,
                        "US_01_03_W2": true,
                        "US_01_03_W8": true,
                        "US_01_03_W3": true,
                        "US_01_03_W5": true,
                        "US_01_03_W7": true,
                        "US_01_03_W4": true
                    },
                    "level_ru_04_01": {
                        "RU_04_01_WT_04": false,
                        "RU_04_01_WT_03": true,
                        "RU_04_01_WT_02": false,
                        "RU_04_01_WT_01": false
                    },
                    "level_us_02_04_new": {
                        "US_02_04_W2": false,
                        "US_02_04_W4": false,
                        "US_02_04_W1": false,
                        "US_02_04_W3": false
                    },
                    "level_ru_03_02": {
                        "RU_03_02_WATCHTOWER_1": true,
                        "RU_03_02_WATCHTOWER_2": false,
                        "RU_03_02_WATCHTOWER_4": true
                    },
                    "level_ru_04_04": {
                        "RU_04_04_WTR_01": false,
                        "RU_04_04_WTR_02": false,
                        "RU_04_04_WTR_03": false,
                        "RU_04_04_WTR_04": false
                    }
                }
            },
            "upgradesGiverData": {
                "level_us_02_02_new": {
                    "US_02_02_UPG_02": 0,
                    "US_02_02_UPG_01": 2,
                    "US_02_02_UPG_05": 0,
                    "US_02_02_UPG_04": 0,
                    "US_02_02_UPG_06": 0
                },
                "level_us_02_03_new": {
                    "US_02_03_UPG_07": 0,
                    "US_02_03_UPG_02": 0,
                    "US_02_03_UPG_04": 0,
                    "US_02_03_UPG_06": 0,
                    "US_02_03_UPG_01": 0,
                    "US_02_03_UPG_05": 2
                },
                "level_ru_02_03": {
                    "RU_02_03_UPGRADE6": 0,
                    "RU_02_03_UPGRADE1": 0,
                    "RU_02_03_UPGRADE4": 0,
                    "RU_02_03_UPGRADE5": 0,
                    "RU_02_03_UPGRADE7": 0,
                    "RU_02_03_UPGRADE8": 0
                },
                "level_us_02_01": {
                    "US_02_01_UPG_06": 0,
                    "US_02_01_UPG_02": 0,
                    "US_02_01_UPG_08": 2,
                    "US_02_01_UPG_04": 2,
                    "US_02_01_UPG_01": 2,
                    "US_02_01_UPG_05": 2,
                    "US_02_01_UPG_07": 0,
                    "US_02_01_UPG_09": 2
                },
                "level_ru_04_02": {
                    "RU_04_02_UPGRADE_01": 0
                },
                "level_ru_02_01_crop": {
                    "RU_02_01_UPGRADE_07": 0,
                    "RU_02_01_UPGRADE_01": 0,
                    "RU_02_01_UPGRADE_02": 0,
                    "RU_02_01_UPGRADE_03": 0,
                    "RU_02_01_UPGRADE_04": 0,
                    "RU_02_01_UPGRADE_06": 0,
                    "RU_02_01_UPGRADE_08": 0
                },
                "level_us_01_01": {
                    "US_01_01_UPGRADE_FLEESTAR_ALLWHEELS": 2,
                    "US_01_01_UPGRADE_CK_SUSPENSION": 2,
                    "US_01_01_UPGRADE_SCOUT_OLD_ENGINE": 2,
                    "US_01_01_UPGRADE_TRUCK_OLD_ENGINE": 1,
                    "US_01_01_UPGRADE_FLEESTAR_SUSP_HIGHT": 2,
                    "US_01_01_UPGRADE_GMC_SUSP_HIGHT": 2,
                    "US_01_01_UPGRADE_G_SCOUT_OFFROAD": 2
                },
                "test_zone_color_summer": {
                    "COLORTEST_UPGRADE": 0
                },
                "level_us_04_01": {
                    "US_04_01_UPG_01": 0,
                    "US_04_01_UPG_03": 0,
                    "US_04_01_UPG_02": 0
                },
                "level_us_04_02": {
                    "US_04_02_UPG_G": 0,
                    "US_04_02_UPG_KOLOB": 0,
                    "US_04_02_UPG_ANK": 0
                },
                "level_us_03_01": {
                    "US_03_01_UPG_01": 0,
                    "US_03_01_UPG_03": 0,
                    "US_03_01_UPG_02": 0,
                    "US_03_01_UPG_04": 0
                },
                "level_ru_03_01": {
                    "RU_03_01_UPGRADE_01": 0,
                    "RU_03_01_UPGRADE_03": 2,
                    "RU_03_01_UPGRADE_05": 2,
                    "RU_03_01_UPGRADE_02": 0,
                    "RU_03_01_UPGRADE_04": 2
                },
                "level_ru_02_04": {
                    "RU_02_04_UPGRADE_02": 0,
                    "RU_02_04_UPGRADE_01": 0,
                    "RU_02_04_UPGRADE_03": 0
                },
                "level_us_03_02": {
                    "US_03_02_PAYSTAR_5600_TS": 0,
                    "US_03_02_BOAR_45318_SUS_HI": 0,
                    "US_03_02_G_SCOUT_FINETUNE": 0,
                    "US_03_02_G_SPECIAL_FINETUNE": 0
                },
                "level_us_01_02": {
                    "US_01_02_UPGRADE_CHEVY_DIFF_LOCK": 2,
                    "US_01_02_UPGRADE_TRUCK_ENG_4070": 2,
                    "US_01_02_UPGRADE_GMC_DIFF_LOCK": 2,
                    "US_01_02_UPGRADE_TRUCK_ENG": 2,
                    "US_01_02_UPGRADE_WHITE_SUSP_HIGH": 0,
                    "US_01_02_UPGRADE_INTERN_SCOUT_SUSP_HIGH": 0,
                    "US_01_02_UPGRADE_WHITE_ALLWHEELS": 2,
                    "US_01_02_UPGRADE_G_SCOUT_HIGHWAY": 0
                },
                "level_ru_04_03": {
                    "RU_04_03_UPGRADE_01": 0
                },
                "level_ru_02_02": {
                    "RU_02_02_UPGRADE_01": 0,
                    "RU_02_02_UPGRADE_08": 0,
                    "RU_02_02_UPGRADE_09": 1,
                    "RU_02_02_UPGRADE_03": 0,
                    "RU_02_02_UPGRADE_05": 0,
                    "RU_02_02_UPGRADE_02": 0,
                    "RU_02_02_UPGRADE_04": 0,
                    "RU_02_02_UPGRADE_06": 0
                },
                "level_us_01_04_new": {
                    "US_01_04_UPG_1": 2,
                    "US_01_04_UPG_3": 2
                },
                "test_zone_color_winter": {
                    "test_zone_upgrade": 0
                },
                "level_us_01_03": {
                    "US_01_03_UPG_3": 2,
                    "US_01_03_UPG_2": 2,
                    "US_01_03_UPG_4": 2,
                    "US_01_03_UPG_6": 2
                },
                "level_ru_04_01": {
                    "RU_04_01_KHAN_UPG": 0
                },
                "level_us_02_04_new": {
                    "US_02_04_UPG_3": 0,
                    "US_02_04_UPG_2": 0,
                    "US_02_04_UPG_1": 0,
                    "US_02_04_UPG_5": 0
                },
                "level_ru_03_02": {
                    "RU_03_02_UPG_2": 2,
                    "RU_03_02_UPG_5": 0,
                    "RU_03_02_UPG_3": 2,
                    "RU_03_02_UPG_4": 0,
                    "RU_03_02_UPG_DETECTOR": 0
                },
                "level_ru_04_04": {
                    "RU_04_04_UPG_01": 0,
                    "RU_04_04_UPG_02": 0
                }
            },
            "cargoLoadingCounts": {
                "level_us_02_01 || US_02_01_WAREHOUSE_01": {
                    "CargoPipesMedium": -1,
                    "CargoBricks": -1,
                    "CargoServiceSpareParts": -1
                },
                "level_us_03_02 || US_03_02_FUEL_BASE_01": {
                    "CargoBarrels": -1
                },
                "test_zone_color_winter || test_zone_pickup": {
                    "CargoBricks": -1,
                    "CargoBarrels": -1
                },
                "level_ru_02_02 || RU_02_02_RAILWAY": {
                    "CargoServiceSpareParts": -1,
                    "CargoContainerSmall": -1,
                    "CargoBags": -1,
                    "CargoBarrelsOil": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_01": {
                    "CargoMetalPlanks": 2
                },
                "level_us_03_01 || US_03_01_CR_MT_06": {
                    "CargoMetalPlanks": 2
                },
                "level_us_03_01 || US_03_01_CR_WD_02": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_08": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_09": {
                    "CargoBricks": 2
                },
                "level_us_04_02 || US_04_02_WOODC_3": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_02_04 || RU_02_04_SUPPLY_PICKUP": {
                    "CargoBags": -1
                },
                "level_us_01_02 || US_01_02_FARM": {
                    "CargoCrateLarge": -1
                },
                "level_ru_04_04 || RU_04_04_RD_06": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_01 || US_04_01_CR_WD_16": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_02_01 || US_02_01_LOG_STATION": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_03_01 || US_03_01_WAREHOUSE_01": {
                    "CargoPipesSmall": 2,
                    "CargoConcreteBlocks": 2,
                    "CargoPipeLarge": 2,
                    "CargoContainerSmall": 1,
                    "CargoBarrels": 2,
                    "CargoBags": 2,
                    "CargoConcreteSlab": 2
                },
                "level_ru_02_02 || RU_02_02_FACTORY": {
                    "CargoServiceSpareParts": -1,
                    "CargoVehiclesSpareParts": -1,
                    "CargoConcreteSlab": -1
                },
                "level_us_04_02 || US_04_02_METALC_10": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_01 || US_04_01_CR_BR_13": {
                    "CargoBricks": 2
                },
                "level_us_04_02 || US_04_02_METALC_6": {
                    "CargoMetalPlanks": 1
                },
                "level_ru_03_01 || RU_03_01_TRAIN_STATION": {
                    "CargoServiceSpareParts": -1
                },
                "level_us_03_01 || US_03_01_CR_BR_01": {
                    "CargoBricks": 2
                },
                "level_us_03_01 || US_03_01_LOGS_02": {
                    "CargoLogsLong": 6,
                    "CargoLogsMedium": 6
                },
                "level_us_03_01 || US_03_01_CR_MT_09": {
                    "CargoMetalPlanks": 2
                },
                "level_us_04_01 || US_04_01_LOGS_01": {
                    "CargoWoodenPlanks": 4
                },
                "level_ru_04_02 || RU_04_02_FUEL_STORAGE": {
                    "CargoBarrels": -1
                },
                "level_us_02_03_new || US_02_03_LOG_STATION_01": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_03_02 || WOODEN_CARCASS_14": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_02 || WOODEN_CARCASS_13": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_BRICKC_1": {
                    "CargoBricks": 2
                },
                "level_us_02_03_new || US_02_03_LOG_STATION_02": {
                    "CargoWoodenPlanks": -1
                },
                "level_ru_02_02 || RU_02_02_LOGS_04": {
                    "CargoLogsLong": 3,
                    "CargoLogsMedium": 4
                },
                "level_us_04_01 || US_04_01_CR_BR_15": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_05": {
                    "CargoBricks": 2
                },
                "level_ru_02_02 || RU_02_02_GAS_01": {
                    "CargoBarrels": -1
                },
                "level_us_01_03 || US_01_03_ABANDONED_DS_02": {
                    "CargoContainerLargeDrilling": -1
                },
                "level_ru_04_01 || RU_04_01_WAREHOUSE": {
                    "CargoBricks": -1,
                    "CargoConcreteBlocks": -1,
                    "CargoWoodenPlanks": 10,
                    "CargoServiceSpareParts": -1,
                    "CargoContainerSmall": -1,
                    "CargoBarrels": -1,
                    "CargoMetalRoll": -1
                },
                "level_us_04_01 || US_04_01_LOGS_02": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_03_01 || RU_03_01_WAREHOUSE": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_11": {
                    "CargoMetalPlanks": 2
                },
                "level_tutorial_objectives || TUT_OBJ_STORAGE_PICKUP": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_04_01 || US_04_01_CR_BR_02": {
                    "CargoBricks": 2
                },
                "level_us_02_01 || US_02_01_FUEL_PICKUP_01": {
                    "CargoBarrels": -1
                },
                "level_ru_test_polygon || RU_POLYGON_CARGO_LOADING": {
                    "CargoForcklift": -1,
                    "CargoBigDrill": -1,
                    "CargoPipesMedium": -1,
                    "CargoLogsMedium": -1,
                    "CargoForkliftCaravanContainer2": -1,
                    "CargoConcreteBlocks": -1,
                    "CargoRocketPart2": -1,
                    "CargoPipesSmall": -1,
                    "CargoRocketEngine": -1,
                    "CargoWing2": -1,
                    "CargoBricks": -1,
                    "CargoWing1": -1,
                    "CargoPlane": -1,
                    "CargoConcreteSlab": -1,
                    "CargoRocketPart1": -1,
                    "CargoVehiclesSpareParts": -1,
                    "CargoBarrelsOil": -1,
                    "CargoBA20": -1,
                    "CargoContainerSmallSpecial": -1,
                    "CargoMetalPlanks": -1,
                    "CargoBarrels": -1,
                    "CargoSequoia": -1,
                    "CargoPipeLarge": -1,
                    "CargoBA20Add": -1,
                    "CargoRailway": -1,
                    "CargoContainerLarge": -1,
                    "CargoWoodenPlanks": -1,
                    "CargoCellulose": -1,
                    "CargoContainerSmall": -1,
                    "CargoLogsShort": -1,
                    "CargoServiceSpareParts": -1,
                    "CargoMetalRoll": -1,
                    "CargoContainerLargeDrilling": -1,
                    "CargoCrateLarge": -1,
                    "CargoRadioactive": -1,
                    "CargoServiceSparePartsSpecial": -1,
                    "CargoLogsLong": -1,
                    "CargoBags2": -1,
                    "CargoBags": -1
                },
                "level_ru_04_04 || RU_04_04_RD_02": {
                    "CargoMetalPlanks": 1
                },
                "level_us_02_03_new || US_02_03_LOGS_01": {
                    "CargoLogsLong": -1
                },
                "level_ru_04_02 || RU_04_02_WAREHOUSE_FARM": {
                    "CargoWoodenPlanks": 3,
                    "CargoPipeLarge": -1,
                    "CargoServiceSpareParts": -1
                },
                "level_us_02_01 || US_02_01_CONSUMABLES_LOAD": {
                    "CargoServiceSpareParts": -1
                },
                "level_ru_04_04 || RU_04_04_CR_BR_04": {
                    "CargoBricks": 2
                },
                "level_us_03_01 || US_03_01_LOGS_04": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_04_01 || US_04_01_CR_WD_01": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_01_01 || US_01_01_LUMBER_MILL": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_04_01 || US_04_01_CR_BR_03": {
                    "CargoBricks": 2
                },
                "level_ru_04_02 || RU_04_02_TOWN_STORAGE": {
                    "CargoBricks": 2,
                    "CargoMetalPlanks": -1,
                    "CargoContainerLarge": -1
                },
                "level_us_02_01 || US_02_01_PORT": {
                    "CargoPipeLarge": -1,
                    "CargoCrateLarge": -1,
                    "CargoContainerLargeDrilling": -1,
                    "CargoContainerSmall": -1,
                    "CargoContainerLarge": -1
                },
                "level_us_01_02 || US_01_02_BARRELS_LOADING": {
                    "CargoBarrels": -1
                },
                "level_us_03_02 || WOODEN_CARCASS_3": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_WAREHOUSE_4": {
                    "CargoCrateLarge": -1,
                    "CargoContainerSmall": 1,
                    "CargoMetalPlanks": 2,
                    "CargoMetalRoll": 16,
                    "CargoBags": 6
                },
                "level_us_04_01 || US_04_01_CR_BR_19": {
                    "CargoBricks": 2
                },
                "level_ru_02_01_crop || RU_02_01_PICKUP_QUARRY": {
                    "CargoConcreteSlab": -1
                },
                "level_us_04_01 || US_04_01_CR_MET_05": {
                    "CargoMetalPlanks": 2
                },
                "level_us_02_03_new || US_02_03_LOGS_02": {
                    "CargoLogsMedium": -1
                },
                "level_us_03_01 || US_03_01_LOGS_03": {
                    "CargoLogsLong": 6,
                    "CargoLogsMedium": 6
                },
                "level_us_01_03 || US_01_03_METAL_LOADING": {
                    "CargoWoodenPlanks": -1,
                    "CargoMetalPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_02": {
                    "CargoMetalPlanks": 2
                },
                "level_us_02_03_new || US_02_03_WAREHOUSE": {
                    "CargoPipeLarge": -1,
                    "CargoPipesMedium": -1,
                    "CargoPipesSmall": -1,
                    "CargoConcreteBlocks": -1,
                    "CargoBags": -1
                },
                "level_us_03_01 || US_03_01_CR_BR_06": {
                    "CargoBricks": 2
                },
                "level_us_03_01 || US_03_01_CR_WD_07": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_02_03_new || US_02_03_OIL_SERVICE": {
                    "CargoServiceSparePartsSpecial": -1
                },
                "level_us_04_01 || US_04_01_CR_WD_13": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_LOG_STATION": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_04_02 || US_04_02_WOODC_11": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_04_04 || RU_04_04_CR_BR_02": {
                    "CargoBricks": 2
                },
                "level_us_03_01 || US_03_01_FUEL_STORAGE": {
                    "CargoBarrels": -1
                },
                "level_ru_03_02 || RU_03_02_METAL_CARGO": {
                    "CargoMetalPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_08": {
                    "CargoMetalPlanks": 2
                },
                "level_us_03_01 || US_03_01_WAREHOUSE_02": {
                    "CargoConcreteBlocks": 4,
                    "CargoCrateLarge": 4,
                    "CargoContainerSmall": -1,
                    "CargoMetalRoll": 4,
                    "CargoBags": 8,
                    "CargoConcreteSlab": 4
                },
                "level_us_04_02 || US_04_02_WOODC_1": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_02_02_new || US_02_02_MILL": {
                    "CargoWoodenPlanks": -1
                },
                "level_ru_04_04 || RU_04_04_RD_03": {
                    "CargoMetalPlanks": 1
                },
                "level_us_01_01 || US_01_01_FACTORY": {
                    "CargoServiceSpareParts": -1
                },
                "level_us_03_02 || WOODEN_CARCASS_10": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_02 || US_03_02_LOG_STATION_A": {
                    "CargoLogsMedium": -1
                },
                "level_us_02_02_new || US_02_02_WAREHOUSE_02": {
                    "CargoPipesMedium": -1,
                    "CargoBags": -1,
                    "CargoBricks": -1,
                    "CargoPipesSmall": -1,
                    "CargoConcreteSlab": -1
                },
                "level_us_04_02 || US_04_02_WOODC_2": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_WARE_01": {
                    "CargoBags": -1,
                    "CargoBricks": -1,
                    "CargoPipesSmall": -1,
                    "CargoMetalPlanks": 2,
                    "CargoBarrels": -1,
                    "CargoMetalRoll": 2,
                    "CargoCrateLarge": -1
                },
                "level_us_03_01 || US_03_01_CR_WD_06": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_METALC_8": {
                    "CargoMetalPlanks": 1
                },
                "level_ru_04_04 || US_04_04_LOGS_01": {
                    "CargoLogsLong": -1
                },
                "level_ru_04_04 || RU_04_04_RD_05": {
                    "CargoMetalPlanks": 1
                },
                "level_us_03_02 || METAL_CARCASS_1": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_02 || US_04_02_BRICKC_4": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_WARE_02": {
                    "CargoConcreteBlocks": 2,
                    "CargoMetalPlanks": 3,
                    "CargoMetalRoll": 2,
                    "CargoConcreteSlab": 2,
                    "CargoCrateLarge": 2
                },
                "level_ru_04_04 || US_04_04_LOGS_02": {
                    "CargoLogsMedium": -1,
                    "CargoLogsShort": -1
                },
                "level_us_01_02 || US_01_02_DRILLING": {
                    "CargoBarrels": -1
                },
                "level_ru_04_04 || RU_04_04_LIMITED_CARGO_02": {
                    "CargoPipesMedium": 1,
                    "CargoBricks": 2,
                    "CargoPipesSmall": 3,
                    "CargoConcreteBlocks": 2
                },
                "level_us_03_02 || WOODEN_CARCASS_16": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_02_01_crop || RU_02_01_BLD_GAS": {
                    "CargoBarrels": -1
                },
                "level_us_04_01 || US_04_01_WARE_03": {
                    "CargoPipesSmall": 2,
                    "CargoWoodenPlanks": 2,
                    "CargoMetalPlanks": -1,
                    "CargoBarrels": 6,
                    "CargoMetalRoll": 4,
                    "CargoBags": 10
                },
                "level_us_04_01 || US_04_01_CR_WD_04": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_01 || US_03_01_CR_BR_02": {
                    "CargoBricks": 2
                },
                "level_us_01_03 || US_01_03_LUMBER_MILL_UNLOCK": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_WD_04": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_01_02 || US_01_02_QUARRY": {
                    "CargoBags": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_05": {
                    "CargoMetalPlanks": 2
                },
                "level_ru_02_04 || RU_02_04_PLANKS_PICKUP": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_04_01 || US_04_01_CR_MET_04": {
                    "CargoMetalPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_21": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_12": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_BRICKC_5": {
                    "CargoBricks": 2
                },
                "level_us_03_02 || US_03_02_STATION_HANGAR_01": {
                    "CargoServiceSpareParts": -1,
                    "CargoMetalRoll": 15
                },
                "level_us_02_01 || US_02_01_FACTORY_02": {
                    "CargoMetalPlanks": -1
                },
                "level_ru_02_01_crop || RU_02_01_OLD_LUMBERMILL": {
                    "CargoWoodenPlanks": -1
                },
                "level_ru_04_04 || US_04_04_LOGS_03": {
                    "CargoLogsMedium": -1
                },
                "level_ru_02_02 || RU_02_02_LOGS_01": {
                    "CargoLogsLong": 3,
                    "CargoLogsMedium": 4
                },
                "level_us_03_02 || METAL_CARCASS_2": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_01 || US_04_01_CR_WD_14": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_04_04 || RU_04_04_RD_04": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_02 || US_04_02_WOODC_4": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_22": {
                    "CargoBricks": 2
                },
                "level_us_03_01 || US_03_01_CR_WD_01": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_WOODC_5": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_09": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_WOODC_6": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_METALC_5": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_02 || US_04_02_WOODC_10": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_MET_03": {
                    "CargoMetalPlanks": 2
                },
                "level_us_04_02 || US_04_02_METALC_2": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_01 || US_04_01_CR_BR_01": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_18": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_07": {
                    "CargoBricks": 2
                },
                "level_us_02_03_new || US_02_03_AIRPORT": {
                    "CargoCrateLarge": -1,
                    "CargoContainerLargeDrilling": -1,
                    "CargoContainerLarge": -1
                },
                "level_us_03_02 || WOODEN_CARCASS_2": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_02 || US_04_02_WOODC_7": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_04_04 || RU_04_04_CR_BR_03": {
                    "CargoBricks": 2
                },
                "level_us_03_01 || US_03_01_CR_BR_05": {
                    "CargoBricks": 2
                },
                "level_us_01_02 || US_01_02_LOGISTICS_BASE": {
                    "CargoServiceSparePartsSpecial": -1
                },
                "level_us_02_01 || US_02_01_LUMBER_MILL": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_01_02 || US_01_02_WAREHOUSE_02": {
                    "CargoWoodenPlanks": -1,
                    "CargoConcreteBlocks": -1,
                    "CargoMetalPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_10": {
                    "CargoMetalPlanks": 2
                },
                "level_us_04_02 || US_04_02_WOODC_8": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_10": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_02_04_new || US_02_04_STOCK_LOADING": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_04_01 || US_04_01_CR_MET_02": {
                    "CargoMetalPlanks": 2
                },
                "level_ru_03_02 || RU_03_02_LOGS_01": {
                    "CargoLogsMedium": 6
                },
                "level_us_03_02 || WOODEN_CARCASS_9": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_02_02 || RU_02_02_LUMBER_MILL": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_04_01 || US_04_01_CR_BR_04": {
                    "CargoBricks": 2
                },
                "level_ru_02_01_crop || RU_02_01_LOGS_02": {
                    "CargoLogsMedium": 3
                },
                "level_us_04_02 || US_04_02_WOODC_9": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_01_04_new || US_01_04_LOG_LOADING": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_04_01 || US_04_01_CR_WD_03": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_02_02 || RU_02_02_GORLAG": {
                    "CargoRadioactive": -1
                },
                "level_us_04_01 || US_04_01_CR_MET_01": {
                    "CargoMetalPlanks": 0
                },
                "level_us_04_01 || US_04_01_CR_BR_12": {
                    "CargoBricks": 2
                },
                "level_ru_04_02 || RU_04_02_WAREHOUSE": {
                    "CargoBricks": -1,
                    "CargoWoodenPlanks": -1,
                    "CargoConcreteSlab": -1
                },
                "level_us_02_03_new || US_02_03_DRILL_SITE": {
                    "CargoBarrelsOil": -1,
                    "CargoBarrels": -1
                },
                "level_us_04_01 || US_04_01_CR_WD_08": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_LUMBER": {
                    "CargoWoodenPlanks": -1
                },
                "level_ru_02_02 || RU_02_02_LOGS_03": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_04_02 || US_04_02_METALC_4": {
                    "CargoMetalPlanks": 1
                },
                "level_us_03_02 || WOODEN_CARCASS_1": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_17": {
                    "CargoBricks": 2
                },
                "level_ru_03_01 || RU_03_01_PORT_PICKUP": {
                    "CargoMetalPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_WD_05": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_01 || US_03_01_CR_BR_04": {
                    "CargoBricks": 2
                },
                "level_us_02_02_new || US_02_02_WAREHOUSE_01": {
                    "CargoPipesMedium": -1,
                    "CargoPipesSmall": -1,
                    "CargoBags": -1,
                    "CargoConcreteSlab": -1
                },
                "level_us_02_01 || US_02_01_LOG_STATION_02": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_04_02 || US_04_02_METALC_9": {
                    "CargoMetalPlanks": 1
                },
                "level_us_04_02 || US_04_02_METALC_3": {
                    "CargoMetalPlanks": 1
                },
                "level_ru_04_01 || RU_04_01_LOGSTATION": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1,
                    "CargoLogsShort": -1
                },
                "level_us_01_03 || US_01_03_ABANDONED_DS_01": {
                    "CargoContainerLargeDrilling": -1
                },
                "level_us_02_03_new || US_02_03_SERVICE_HUB": {
                    "CargoServiceSpareParts": -1
                },
                "level_ru_04_04 || RU_04_04_RD_01": {
                    "CargoMetalPlanks": 1
                },
                "level_us_01_01 || US_01_01_FARM": {
                    "CargoCrateLarge": -1
                },
                "level_ru_03_02 || RU_03_02_WOOD_CARGO": {
                    "CargoWoodenPlanks": -1
                },
                "level_us_04_01 || US_04_01_CR_WD_07": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_02 || WOODEN_CARCASS_4": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_01 || US_03_01_LOGS_06": {
                    "CargoLogsLong": 9,
                    "CargoLogsMedium": 9
                },
                "level_us_01_02 || US_01_02_LOGSTATION": {
                    "CargoLogsMedium": -1
                },
                "level_us_02_01 || US_02_01_DRILLING_SITE": {
                    "CargoBarrelsOil": -1
                },
                "level_us_01_04_new || US_01_04_LOST_SHIP": {
                    "CargoContainerLarge": -1
                },
                "level_ru_02_02 || RU_02_02_WAREHOUSE": {
                    "CargoMetalPlanks": -1,
                    "CargoVehiclesSpareParts": -1
                },
                "level_us_01_03 || US_01_03_LOST_CARGO_TSK": {
                    "CargoContainerLargeDrilling": 0
                },
                "level_us_03_01 || US_03_01_CR_MT_04": {
                    "CargoMetalPlanks": 2
                },
                "level_ru_04_04 || RU_04_04_LIMITED_CARGO_01": {
                    "CargoBarrels": 3,
                    "CargoMetalRoll": -1,
                    "CargoPipesSmall": 1,
                    "CargoConcreteSlab": 1
                },
                "level_us_02_02_new || US_02_02_GAS_01_PICKUP": {
                    "CargoBarrels": -1
                },
                "level_us_04_02 || US_04_02_METALC_1": {
                    "CargoMetalPlanks": 1
                },
                "level_us_03_02 || WOODEN_CARCASS_5": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_02": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_03_02 || RU_03_02_WAREHOUSE_LOADING": {
                    "CargoContainerSmall": -1,
                    "CargoBarrels": -1,
                    "CargoVehiclesSpareParts": -1
                },
                "level_ru_02_04 || RU_02_04_METAL_PICKUP": {
                    "CargoMetalPlanks": -1
                },
                "level_us_02_04_new || US_02_04_WAREHOUSE_LOADING": {
                    "CargoConcreteBlocks": -1
                },
                "level_us_03_02 || WOODEN_CARCASS_6": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_11": {
                    "CargoBricks": 2
                },
                "level_us_04_02 || US_04_02_BRICKC_3": {
                    "CargoBricks": 2
                },
                "level_us_02_02_new || US_02_02_OIL_SERVICE": {
                    "CargoServiceSparePartsSpecial": -1,
                    "CargoContainerLargeDrilling": -1
                },
                "level_us_03_02 || WOODEN_CARCASS_7": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_01_03 || US_01_03_LOG_STATION": {
                    "CargoLogsMedium": -1
                },
                "level_us_04_01 || US_04_01_CR_BR_06": {
                    "CargoBricks": 2
                },
                "level_us_02_01 || US_02_01_WAREHOUSE_02": {
                    "CargoPipesMedium": -1,
                    "CargoBags": -1,
                    "CargoBricks": -1,
                    "CargoServiceSpareParts": -1
                },
                "level_us_01_03 || US_01_03_RETRANSLATOR": {
                    "CargoContainerSmall": -1
                },
                "level_us_03_02 || WOODEN_CARCASS_8": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_01 || US_03_01_CR_WD_08": {
                    "CargoWoodenPlanks": 2
                },
                "level_ru_02_01_crop || RU_02_01_LOGS_01": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_04_01 || US_04_01_CR_BR_16": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_LOGS_01_01": {
                    "CargoLogsMedium": -1
                },
                "level_ru_04_04 || RU_04_04_CR_BR_01": {
                    "CargoBricks": 2
                },
                "level_us_03_02 || WOODEN_CARCASS_15": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_01 || US_03_01_CR_BR_03": {
                    "CargoBricks": 2
                },
                "level_us_02_02_new || US_02_02_FACTORY": {
                    "CargoMetalPlanks": -1
                },
                "level_us_02_02_new || US_02_02_GAS_02_PICKUP": {
                    "CargoBarrels": -1
                },
                "level_us_01_02 || US_01_02_SERVICE_HUB": {
                    "CargoServiceSpareParts": -1,
                    "CargoVehiclesSpareParts": -1,
                    "CargoBigDrill": -1
                },
                "level_us_03_01 || US_03_01_LOGS_05": {
                    "CargoLogsLong": 6,
                    "CargoLogsMedium": 6
                },
                "level_us_02_03_new || US_02_03_GAS_PICKUP": {
                    "CargoBarrels": -1
                },
                "level_ru_02_03 || RU_02_03_ABANDONED_FACTORY_PICKUP": {
                    "CargoMetalPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_03": {
                    "CargoMetalPlanks": 2
                },
                "level_us_01_01 || US_01_01_TOWN_STORAGE": {
                    "CargoMetalPlanks": -1
                },
                "level_ru_02_01_crop || RU_02_01_PICKUP_SHIPWRECK": {
                    "CargoContainerLarge": -1
                },
                "level_ru_03_01 || RU_03_01_LOGS_01": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_02_01 || US_02_01_FUEL_PICKUP_02": {
                    "CargoBarrels": -1
                },
                "level_ru_04_04 || RU_04_04_CR_BR_06": {
                    "CargoBricks": 2
                },
                "level_us_02_03_new || US_02_03_MILL": {
                    "CargoWoodenPlanks": -1
                },
                "level_ru_04_04 || RU_04_04_WAREHOUSE_02": {
                    "CargoConcreteBlocks": -1,
                    "CargoBags": -1,
                    "CargoBarrelsOil": -1
                },
                "level_us_04_02 || US_04_02_BRICKC_7": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_11": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_03_01 || US_03_01_CR_WD_03": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_10": {
                    "CargoBricks": 2
                },
                "level_us_01_02 || US_01_02_WAREHOUSE_01": {
                    "CargoBricks": -1,
                    "CargoConcreteSlab": -1
                },
                "level_us_04_02 || US_04_02_BRICKC_2": {
                    "CargoBricks": 2
                },
                "level_us_02_02_new || US_02_02_SERVICE": {
                    "CargoServiceSpareParts": -1,
                    "CargoCrateLarge": -1
                },
                "level_us_04_01 || US_04_01_CR_BR_20": {
                    "CargoBricks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_06": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_01_01 || US_01_01_LOG_STATION": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_04_01 || US_04_01_LOGS_02_01": {
                    "CargoLogsLong": -1,
                    "CargoLogsMedium": -1
                },
                "level_us_01_03 || US_01_03_ABANDONED_DS_03": {
                    "CargoContainerLargeDrilling": -1
                },
                "level_us_01_01 || US_01_01_WAREHOUSE": {
                    "CargoBricks": -1,
                    "CargoConcreteBlocks": -1,
                    "CargoServiceSpareParts": -1,
                    "CargoMetalPlanks": -1
                },
                "level_us_03_01 || US_03_01_RAILWAY": {
                    "CargoConcreteBlocks": -1,
                    "CargoCrateLarge": 4,
                    "CargoContainerSmall": 4,
                    "CargoBarrels": 6,
                    "CargoConcreteSlab": -1
                },
                "level_us_test_polygon || US_POLYGON_PICKUP": {
                    "CargoForcklift": -1,
                    "CargoBigDrill": -1,
                    "CargoPipesMedium": -1,
                    "CargoLogsMedium": -1,
                    "CargoForkliftCaravanContainer2": -1,
                    "CargoConcreteBlocks": -1,
                    "CargoRocketPart2": -1,
                    "CargoPipesSmall": -1,
                    "CargoRocketEngine": -1,
                    "CargoWing2": -1,
                    "CargoBricks": -1,
                    "CargoWing1": -1,
                    "CargoPlane": -1,
                    "CargoConcreteSlab": -1,
                    "CargoRocketPart1": -1,
                    "CargoVehiclesSpareParts": -1,
                    "CargoBarrelsOil": -1,
                    "CargoBA20": -1,
                    "CargoContainerSmallSpecial": -1,
                    "CargoMetalPlanks": -1,
                    "CargoBarrels": -1,
                    "CargoSequoia": -1,
                    "CargoPipeLarge": -1,
                    "CargoBA20Add": -1,
                    "CargoRailway": -1,
                    "CargoContainerLarge": -1,
                    "CargoWoodenPlanks": -1,
                    "CargoCellulose": -1,
                    "CargoContainerSmall": -1,
                    "CargoLogsShort": -1,
                    "CargoServiceSpareParts": -1,
                    "CargoMetalRoll": -1,
                    "CargoContainerLargeDrilling": -1,
                    "CargoCrateLarge": -1,
                    "CargoRadioactive": -1,
                    "CargoServiceSparePartsSpecial": -1,
                    "CargoLogsLong": -1,
                    "CargoBags2": -1,
                    "CargoBags": -1
                },
                "level_us_04_02 || US_04_02_METALC_7": {
                    "CargoMetalPlanks": 1
                },
                "level_us_02_01 || US_02_01_SERVICE_HUB": {
                    "CargoServiceSpareParts": -1
                },
                "test_zone_color_summer || COLORTEST_CARGOLOADING": {
                    "CargoBags": -1
                },
                "level_us_03_01 || US_03_01_LOGS_01": {
                    "CargoLogsLong": 6,
                    "CargoLogsMedium": 6
                },
                "level_us_02_03_new || US_02_03_FACTORY": {
                    "CargoConcreteBlocks": -1,
                    "CargoMetalPlanks": -1
                },
                "level_us_01_04_new || US_01_04_LOG_STATION": {
                    "CargoLogsLong": -1
                },
                "level_ru_04_04 || RU_04_04_CR_BR_05": {
                    "CargoBricks": 2
                },
                "level_us_03_01 || US_03_01_CR_BR_07": {
                    "CargoBricks": 2
                },
                "level_us_02_01 || US_02_01_FACTORY_01": {
                    "CargoPipeLarge": -1,
                    "CargoMetalPlanks": -1
                },
                "level_us_03_01 || US_03_01_CR_MT_07": {
                    "CargoMetalPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_05": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_WD_15": {
                    "CargoWoodenPlanks": 2
                },
                "level_us_04_01 || US_04_01_CR_BR_14": {
                    "CargoBricks": 2
                },
                "level_us_04_02 || US_04_02_BRICKC_6": {
                    "CargoBricks": 2
                },
                "level_us_02_01 || US_02_01_OIL_SERVICE": {
                    "CargoServiceSparePartsSpecial": -1
                },
                "level_us_04_01 || US_04_01_RAILWAY": {
                    "CargoConcreteBlocks": 4,
                    "CargoCrateLarge": 4,
                    "CargoContainerSmall": -1,
                    "CargoMetalPlanks": 2,
                    "CargoBarrels": 6,
                    "CargoMetalRoll": 4,
                    "CargoConcreteSlab": 2
                }
            },
            "waypoints": {
                "level_us_02_02_new": [],
                "level_us_02_04_new": [],
                "level_us_01_01": [],
                "level_us_02_01": [],
                "level_ru_03_01": [],
                "level_us_01_04_new": [],
                "level_ru_02_02": [],
                "level_ru_03_02": [],
                "level_us_01_02": [],
                "level_us_04_01": [],
                "level_us_01_03": [],
                "level_ru_04_01": [
                    {
                        "point": {
                            "x": -2.1476538181304932,
                            "y": 0.20118790864944458,
                            "z": -2.1215906143188477
                        },
                        "modelHeightBounds": null,
                        "type": 0
                    },
                    {
                        "point": {
                            "x": -2.2740559577941895,
                            "y": 0.17529746890068054,
                            "z": -2.8278267383575439
                        },
                        "modelHeightBounds": null,
                        "type": 0
                    }
                ]
            },
            "discoveredObjects": [
                "level_us_04_01 || US_04_01_CR_MET_01",
                "level_us_04_01 || US_04_01_CR_BR_04",
                "level_us_04_01 || US_04_01_CR_WD_01",
                "level_us_04_01 || US_04_01_CR_WD_02",
                "level_us_04_01 || US_04_01_CR_BR_21",
                "level_us_04_01 || US_04_01_CR_BR_19",
                "level_us_04_01 || US_04_01_CR_BR_17",
                "level_us_04_01 || US_04_01_CR_WD_08",
                "level_us_04_01 || US_04_01_CR_BR_16",
                "level_us_04_01 || US_04_01_CR_WD_04",
                "level_us_04_01 || US_04_01_CR_MET_03"
            ],
            "isFirstGarageDiscovered": true,
            "lastPhantomMode": 300,
            "forcedModelStates": {}
        },
        "SslType": "SaveObject"
    },
    "cfg_version": 1
}
"""
}