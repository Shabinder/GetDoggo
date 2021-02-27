/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.models

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun getDoggoList(): List<Doggo> {
    val serializer = Json {
        isLenient = true
        ignoreUnknownKeys = true
    }
    val list = serializer.decodeFromString<List<Doggo>>(DoggosInfo)
    println(list)
    return list
}

const val DoggosInfo = """[
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "13 - 18",
                    "metric": "6 - 8"
                },
                "height": {
                    "imperial": "12 - 13",
                    "metric": "30 - 33"
                },
                "id": 71,
                "name": "Cavalier King Charles Spaniel",
                "bred_for": "Flushing small birds, companion",
                "breed_group": "Toy",
                "life_span": "10 - 14 years",
                "temperament": "Fearless, Affectionate, Sociable, Patient, Playful, Adaptable",
                "reference_image_id": "HJRBbe94Q"
            }
        ],
        "id": "HJRBbe94Q",
        "url": "https://cdn2.thedogapi.com/images/HJRBbe94Q_1280.jpg",
        "width": 961,
        "height": 558
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "44 - 66",
                    "metric": "20 - 30"
                },
                "height": {
                    "imperial": "18 - 23",
                    "metric": "46 - 58"
                },
                "id": 102,
                "name": "English Shepherd",
                "bred_for": "Herding & guarding livestock, farm watch dog",
                "breed_group": "Working",
                "life_span": "10 - 13 years",
                "temperament": "Kind, Energetic, Independent, Adaptable, Intelligent, Bossy",
                "reference_image_id": "H1QyMe5EQ"
            }
        ],
        "id": "H1QyMe5EQ",
        "url": "https://cdn2.thedogapi.com/images/H1QyMe5EQ_1280.jpg",
        "width": 1920,
        "height": 1280
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "65 - 90",
                    "metric": "29 - 41"
                },
                "height": {
                    "imperial": "23.5 - 27.5",
                    "metric": "60 - 70"
                },
                "id": 119,
                "name": "Giant Schnauzer",
                "bred_for": "Herding, guarding",
                "breed_group": "Working",
                "life_span": "10 - 12 years",
                "temperament": "Strong Willed, Kind, Loyal, Intelligent, Dominant, Powerful",
                "reference_image_id": "H1NIzlcV7"
            }
        ],
        "id": "H1NIzlcV7",
        "url": "https://cdn2.thedogapi.com/images/H1NIzlcV7_1280.jpg",
        "width": 900,
        "height": 600
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "40 - 60",
                    "metric": "18 - 27"
                },
                "height": {
                    "imperial": "18 - 22",
                    "metric": "46 - 56"
                },
                "id": 129,
                "name": "Harrier",
                "bred_for": "Hunting hares by trailing them",
                "breed_group": "Hound",
                "life_span": "12 - 15 years",
                "temperament": "Outgoing, Friendly, Cheerful, Sweet-Tempered, Tolerant, Active",
                "reference_image_id": "B1IcfgqE7"
            }
        ],
        "id": "B1IcfgqE7",
        "url": "https://cdn2.thedogapi.com/images/B1IcfgqE7_1280.jpg",
        "width": 1920,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "15 - 19",
                    "metric": "7 - 9"
                },
                "height": {
                    "imperial": "12 - 15",
                    "metric": "30 - 38"
                },
                "id": 141,
                "name": "Japanese Spitz",
                "bred_for": "Companion",
                "life_span": "10 – 16 years",
                "temperament": "Affectionate, Obedient, Playful, Companionable, Intelligent, Proud",
                "reference_image_id": "HksaMxqNX"
            }
        ],
        "id": "HksaMxqNX",
        "url": "https://cdn2.thedogapi.com/images/HksaMxqNX_1280.jpg",
        "width": 600,
        "height": 351
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "35 - 45",
                    "metric": "16 - 20"
                },
                "height": {
                    "imperial": "17 - 18",
                    "metric": "43 - 46"
                },
                "id": 142,
                "name": "Keeshond",
                "bred_for": "Barge watchdog",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Agile, Obedient, Playful, Quick, Sturdy, Bright",
                "reference_image_id": "S1GAGg9Vm"
            }
        ],
        "id": "S1GAGg9Vm",
        "url": "https://cdn2.thedogapi.com/images/S1GAGg9Vm_1280.jpg",
        "width": 1024,
        "height": 683
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "120 - 230",
                    "metric": "54 - 104"
                },
                "height": {
                    "imperial": "27.5 - 30",
                    "metric": "70 - 76"
                },
                "id": 164,
                "name": "Mastiff",
                "bred_for": "Guardian",
                "breed_group": "Working",
                "life_span": "8 - 10 years",
                "temperament": "Good-natured, Affectionate, Dignified, Protective, Calm, Courageous"
            }
        ],
        "id": "HkAVQl9VX",
        "url": "https://cdn2.thedogapi.com/images/HkAVQl9VX_1280.jpg",
        "width": 800,
        "height": 590
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "88 - 110",
                    "metric": "40 - 50"
                },
                "height": {
                    "imperial": "22 - 25.5",
                    "metric": "56 - 65"
                },
                "id": 185,
                "name": "Perro de Presa Canario",
                "breed_group": "Working",
                "life_span": "10 - 12 years",
                "temperament": "Strong Willed, Suspicious, Gentle, Dominant, Calm",
                "reference_image_id": "S1V3Qeq4X"
            }
        ],
        "id": "S1V3Qeq4X",
        "url": "https://cdn2.thedogapi.com/images/S1V3Qeq4X_1280.jpg",
        "width": 600,
        "height": 483
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "18 - 33",
                    "metric": "8 - 15"
                },
                "height": {
                    "imperial": "15 - 18.5",
                    "metric": "38 - 47"
                },
                "id": 205,
                "name": "Pumi",
                "breed_group": "Herding",
                "life_span": "13 - 15 years",
                "temperament": "Lively, Reserved, Intelligent, Active, Protective, Vocal",
                "reference_image_id": "SyRe4xcN7"
            }
        ],
        "id": "SyRe4xcN7",
        "url": "https://cdn2.thedogapi.com/images/SyRe4xcN7_1280.jpg",
        "width": 695,
        "height": 391
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "14 - 18",
                    "metric": "6 - 8"
                },
                "height": {
                    "imperial": "10 - 12",
                    "metric": "25 - 30"
                },
                "id": 201,
                "name": "Pug",
                "bred_for": "Lapdog",
                "breed_group": "Toy",
                "life_span": "12 - 14 years",
                "temperament": "Docile, Clever, Charming, Stubborn, Sociable, Playful, Quiet, Attentive",
                "reference_image_id": "HyJvcl9N7"
            }
        ],
        "id": "HyJvcl9N7",
        "url": "https://cdn2.thedogapi.com/images/HyJvcl9N7_1280.jpg",
        "width": 800,
        "height": 600
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "9 - 16",
                    "metric": "4 - 7"
                },
                "height": {
                    "imperial": "8 - 11",
                    "metric": "20 - 28"
                },
                "id": 223,
                "name": "Shih Tzu",
                "bred_for": "Lapdog",
                "breed_group": "Toy",
                "life_span": "10 - 18 years",
                "temperament": "Clever, Spunky, Outgoing, Friendly, Affectionate, Lively, Alert, Loyal, Independent, Playful, Gentle, Intelligent, Happy, Active, Courageous",
                "reference_image_id": "BkrJjgcV7"
            }
        ],
        "id": "BkrJjgcV7",
        "url": "https://cdn2.thedogapi.com/images/BkrJjgcV7_1280.jpg",
        "width": 800,
        "height": 600
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "8 - 10",
                    "metric": "4 - 5"
                },
                "height": {
                    "imperial": "9 - 10",
                    "metric": "23 - 25"
                },
                "id": 228,
                "name": "Silky Terrier",
                "bred_for": "Small vermin hunting, companionship",
                "breed_group": "Toy",
                "life_span": "12 - 15 years",
                "temperament": "Friendly, Responsive, Inquisitive, Alert, Quick, Joyful",
                "reference_image_id": "ByzGsl5Nm"
            }
        ],
        "id": "ByzGsl5Nm",
        "url": "https://cdn2.thedogapi.com/images/ByzGsl5Nm_1280.jpg",
        "width": 1599,
        "height": 1142
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "30 - 50",
                    "metric": "14 - 23"
                },
                "height": {
                    "imperial": "16 - 20",
                    "metric": "41 - 51"
                },
                "id": 235,
                "name": "Spanish Water Dog",
                "bred_for": "Herding flocks of sheep and goats from one pasture to another",
                "breed_group": "Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Trainable, Diligent, Affectionate, Loyal, Athletic, Intelligent",
                "reference_image_id": "HJf4jl9VX"
            }
        ],
        "id": "HJf4jl9VX",
        "url": "https://cdn2.thedogapi.com/images/HJf4jl9VX_1280.jpg",
        "width": 1200,
        "height": 922
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "9 - 15",
                    "metric": "4 - 7"
                },
                "height": {
                    "imperial": "10",
                    "metric": "25"
                },
                "id": 245,
                "name": "Tibetan Spaniel",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Willful, Aloof, Assertive, Independent, Playful, Intelligent, Happy",
                "reference_image_id": "Hyjcol947"
            }
        ],
        "id": "Hyjcol947",
        "url": "https://cdn2.thedogapi.com/images/Hyjcol947_1280.jpg",
        "width": 1023,
        "height": 825
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "90 - 120",
                    "metric": "41 - 54"
                },
                "height": {
                    "imperial": "28 - 34",
                    "metric": "71 - 86"
                },
                "id": 5,
                "name": "Akbash Dog",
                "bred_for": "Sheep guarding",
                "breed_group": "Working",
                "life_span": "10 - 12 years",
                "temperament": "Loyal, Independent, Intelligent, Brave",
                "origin": "",
                "reference_image_id": "26pHT3Qk7"
            }
        ],
        "id": "w1Cal_vrT",
        "url": "https://cdn2.thedogapi.com/images/w1Cal_vrT.jpg",
        "width": 1600,
        "height": 1200
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "90 - 120",
                    "metric": "41 - 54"
                },
                "height": {
                    "imperial": "28 - 34",
                    "metric": "71 - 86"
                },
                "id": 5,
                "name": "Akbash Dog",
                "bred_for": "Sheep guarding",
                "breed_group": "Working",
                "life_span": "10 - 12 years",
                "temperament": "Loyal, Independent, Intelligent, Brave",
                "origin": "",
                "reference_image_id": "26pHT3Qk7"
            }
        ],
        "id": "WVawT4Gap",
        "url": "https://cdn2.thedogapi.com/images/WVawT4Gap.jpg",
        "width": 1600,
        "height": 1067
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "65 - 100",
                    "metric": "29 - 45"
                },
                "height": {
                    "imperial": "23 - 25",
                    "metric": "58 - 64"
                },
                "id": 9,
                "name": "Alaskan Malamute",
                "bred_for": "Hauling heavy freight, Sled pulling",
                "breed_group": "Working",
                "life_span": "12 - 15 years",
                "temperament": "Friendly, Affectionate, Devoted, Loyal, Dignified, Playful",
                "reference_image_id": "dW5UucTIW"
            }
        ],
        "id": "BbMFS3bU-",
        "url": "https://cdn2.thedogapi.com/images/BbMFS3bU-.jpg",
        "width": 1280,
        "height": 853
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "65 - 100",
                    "metric": "29 - 45"
                },
                "height": {
                    "imperial": "23 - 25",
                    "metric": "58 - 64"
                },
                "id": 9,
                "name": "Alaskan Malamute",
                "bred_for": "Hauling heavy freight, Sled pulling",
                "breed_group": "Working",
                "life_span": "12 - 15 years",
                "temperament": "Friendly, Affectionate, Devoted, Loyal, Dignified, Playful",
                "reference_image_id": "dW5UucTIW"
            }
        ],
        "id": "aREFAmi5H",
        "url": "https://cdn2.thedogapi.com/images/aREFAmi5H.jpg",
        "width": 1080,
        "height": 731
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "65 - 100",
                    "metric": "29 - 45"
                },
                "height": {
                    "imperial": "23 - 25",
                    "metric": "58 - 64"
                },
                "id": 9,
                "name": "Alaskan Malamute",
                "bred_for": "Hauling heavy freight, Sled pulling",
                "breed_group": "Working",
                "life_span": "12 - 15 years",
                "temperament": "Friendly, Affectionate, Devoted, Loyal, Dignified, Playful",
                "reference_image_id": "dW5UucTIW"
            }
        ],
        "id": "42QrDrylc",
        "url": "https://cdn2.thedogapi.com/images/42QrDrylc.jpg",
        "width": 3576,
        "height": 2505
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "65 - 100",
                    "metric": "29 - 45"
                },
                "height": {
                    "imperial": "23 - 25",
                    "metric": "58 - 64"
                },
                "id": 9,
                "name": "Alaskan Malamute",
                "bred_for": "Hauling heavy freight, Sled pulling",
                "breed_group": "Working",
                "life_span": "12 - 15 years",
                "temperament": "Friendly, Affectionate, Devoted, Loyal, Dignified, Playful",
                "reference_image_id": "dW5UucTIW"
            }
        ],
        "id": "BIZiWPLqX",
        "url": "https://cdn2.thedogapi.com/images/BIZiWPLqX.jpg",
        "width": 3648,
        "height": 2736
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "30 - 150",
                    "metric": "14 - 68"
                },
                "height": {
                    "imperial": "14 - 17",
                    "metric": "36 - 43"
                },
                "id": 11,
                "name": "American Bully",
                "country_code": "US",
                "bred_for": "Family companion dog",
                "breed_group": "",
                "life_span": "8 – 15 years",
                "temperament": "Strong Willed, Stubborn, Friendly, Clownish, Affectionate, Loyal, Obedient, Intelligent, Courageous",
                "reference_image_id": "sqQJDtbpY"
            }
        ],
        "id": "Vsyiy9oyS",
        "url": "https://cdn2.thedogapi.com/images/Vsyiy9oyS.jpg",
        "width": 1200,
        "height": 1056
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 40",
                    "metric": "9 - 18"
                },
                "height": {
                    "imperial": "15 - 19",
                    "metric": "38 - 48"
                },
                "id": 12,
                "name": "American Eskimo Dog",
                "country_code": "US",
                "bred_for": "Circus performer",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Friendly, Alert, Reserved, Intelligent, Protective",
                "reference_image_id": "Bymjyec4m"
            }
        ],
        "id": "csIH7L6eT",
        "url": "https://cdn2.thedogapi.com/images/csIH7L6eT.jpg",
        "width": 1200,
        "height": 1125
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "65 - 75",
                    "metric": "29 - 34"
                },
                "height": {
                    "imperial": "21 - 28",
                    "metric": "53 - 71"
                },
                "id": 14,
                "name": "American Foxhound",
                "country_code": "US",
                "bred_for": "Fox hunting, scent hound",
                "breed_group": "Hound",
                "life_span": "8 - 15 years",
                "temperament": "Kind, Sweet-Tempered, Loyal, Independent, Intelligent, Loving",
                "reference_image_id": "S14n1x9NQ"
            }
        ],
        "id": "qBYpfkZr1",
        "url": "https://cdn2.thedogapi.com/images/qBYpfkZr1.jpg",
        "width": 1600,
        "height": 1200
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "65 - 115",
                    "metric": "29 - 52"
                },
                "height": {
                    "imperial": "24 - 28",
                    "metric": "61 - 71"
                },
                "id": 6,
                "name": "Akita",
                "bred_for": "Hunting bears",
                "breed_group": "Working",
                "life_span": "10 - 14 years",
                "temperament": "Docile, Alert, Responsive, Dignified, Composed, Friendly, Receptive, Faithful, Courageous",
                "reference_image_id": "BFRYBufpm"
            }
        ],
        "id": "MUGiNcu_Z",
        "url": "https://cdn2.thedogapi.com/images/MUGiNcu_Z.jpg",
        "width": 1280,
        "height": 923
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "55 - 90",
                    "metric": "25 - 41"
                },
                "height": {
                    "imperial": "18 - 24",
                    "metric": "46 - 61"
                },
                "id": 7,
                "name": "Alapaha Blue Blood Bulldog",
                "description": "The Alapaha Blue Blood Bulldog is a well-developed, exaggerated bulldog with a broad head and natural drop ears. The prominent muzzle is covered by loose upper lips. The prominent eyes are set well apart. The Alapaha's coat is relatively short and fairly stiff. Preferred colors are blue merle, brown merle, or red merle all trimmed in white or chocolate and white. Also preferred are the glass eyes (blue) or marble eyes (brown and blue mixed in a single eye). The ears and tail are never trimmed or docked. The body is sturdy and very muscular. The well-muscled hips are narrower than the chest. The straight back is as long as the dog is high at the shoulders. The dewclaws are never removed and the feet are cat-like.",
                "bred_for": "Guarding",
                "breed_group": "Mixed",
                "life_span": "12 - 13 years",
                "history": "",
                "temperament": "Loving, Protective, Trainable, Dutiful, Responsible",
                "reference_image_id": "33mJ-V3RX"
            }
        ],
        "id": "33mJ-V3RX",
        "url": "https://cdn2.thedogapi.com/images/33mJ-V3RX.jpg",
        "width": 1828,
        "height": 2065
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "44 - 62",
                    "metric": "20 - 28"
                },
                "height": {
                    "imperial": "17 - 20",
                    "metric": "43 - 51"
                },
                "id": 21,
                "name": "Australian Cattle Dog",
                "country_code": "AU",
                "bred_for": "Cattle herding, herding trials",
                "breed_group": "Herding",
                "life_span": "12 - 14 years",
                "temperament": "Cautious, Energetic, Loyal, Obedient, Protective, Brave",
                "reference_image_id": "IBkYVm4v1"
            }
        ],
        "id": "IBkYVm4v1",
        "url": "https://cdn2.thedogapi.com/images/IBkYVm4v1.jpg",
        "width": 736,
        "height": 850
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "45 - 55",
                    "metric": "20 - 25"
                },
                "height": {
                    "imperial": "20 - 22",
                    "metric": "51 - 56"
                },
                "id": 32,
                "name": "Bearded Collie",
                "bred_for": "Sheep herding",
                "breed_group": "Herding",
                "life_span": "12 - 14 years",
                "temperament": "Self-confidence, Hardy, Lively, Alert, Intelligent, Active",
                "reference_image_id": "A09F4c1qP"
            }
        ],
        "id": "ena5znPUB",
        "url": "https://cdn2.thedogapi.com/images/ena5znPUB.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "45 - 55",
                    "metric": "20 - 25"
                },
                "height": {
                    "imperial": "20 - 22",
                    "metric": "51 - 56"
                },
                "id": 32,
                "name": "Bearded Collie",
                "bred_for": "Sheep herding",
                "breed_group": "Herding",
                "life_span": "12 - 14 years",
                "temperament": "Self-confidence, Hardy, Lively, Alert, Intelligent, Active",
                "reference_image_id": "A09F4c1qP"
            }
        ],
        "id": "Mn2A5Urz0",
        "url": "https://cdn2.thedogapi.com/images/Mn2A5Urz0.jpg",
        "width": 1280,
        "height": 960
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "30 - 45",
                    "metric": "14 - 20"
                },
                "height": {
                    "imperial": "18 - 22",
                    "metric": "46 - 56"
                },
                "id": 50,
                "name": "Border Collie",
                "bred_for": "Sheep herder",
                "breed_group": "Herding",
                "life_span": "12 - 16 years",
                "temperament": "Tenacious, Keen, Energetic, Responsive, Alert, Intelligent",
                "reference_image_id": "sGQvQUpsp"
            }
        ],
        "id": "lpqw_Acag",
        "url": "https://cdn2.thedogapi.com/images/lpqw_Acag.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "50 - 70",
                    "metric": "23 - 32"
                },
                "height": {
                    "imperial": "21 - 22",
                    "metric": "53 - 56"
                },
                "id": 61,
                "name": "Bull Terrier",
                "bred_for": "Bull baiting, Fighting",
                "breed_group": "Terrier",
                "life_span": "10 - 12 years",
                "temperament": "Trainable, Protective, Sweet-Tempered, Keen, Active",
                "reference_image_id": "VSraIEQGd"
            }
        ],
        "id": "q3wSiFZ7m",
        "url": "https://cdn2.thedogapi.com/images/q3wSiFZ7m.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "55 - 80",
                    "metric": "25 - 36"
                },
                "height": {
                    "imperial": "21 - 26",
                    "metric": "53 - 66"
                },
                "id": 76,
                "name": "Chesapeake Bay Retriever",
                "bred_for": "Water Retriever",
                "breed_group": "Sporting",
                "life_span": "10 - 13 years",
                "temperament": "Affectionate, Intelligent, Quiet, Dominant, Happy, Protective",
                "reference_image_id": "9BXwUeCc2"
            }
        ],
        "id": "ILaCjZC33",
        "url": "https://cdn2.thedogapi.com/images/ILaCjZC33.jpg",
        "width": 1080,
        "height": 1350
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "23 - 28",
                    "metric": "10 - 13"
                },
                "height": {
                    "imperial": "15.5 - 20",
                    "metric": "39 - 51"
                },
                "id": 111,
                "name": "Finnish Spitz",
                "bred_for": "Hunting birds, small mammals",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Playful, Loyal, Independent, Intelligent, Happy, Vocal",
                "reference_image_id": "3PjHlQbkV"
            }
        ],
        "id": "7pTie4t9y",
        "url": "https://cdn2.thedogapi.com/images/7pTie4t9y.jpg",
        "width": 540,
        "height": 359
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "23 - 28",
                    "metric": "10 - 13"
                },
                "height": {
                    "imperial": "15.5 - 20",
                    "metric": "39 - 51"
                },
                "id": 111,
                "name": "Finnish Spitz",
                "bred_for": "Hunting birds, small mammals",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Playful, Loyal, Independent, Intelligent, Happy, Vocal",
                "reference_image_id": "3PjHlQbkV"
            }
        ],
        "id": "pSoC1qW8n",
        "url": "https://cdn2.thedogapi.com/images/pSoC1qW8n.jpg",
        "width": 1280,
        "height": 943
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 30",
                    "metric": "9 - 14"
                },
                "height": {
                    "imperial": "14 - 16",
                    "metric": "36 - 41"
                },
                "id": 145,
                "name": "Kooikerhondje",
                "bred_for": "Luring ducks into traps - \"tolling\"",
                "breed_group": "Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Benevolent, Agile, Alert, Intelligent, Active, Territorial",
                "reference_image_id": "kOMy84GQE"
            }
        ],
        "id": "g2tW0bptM",
        "url": "https://cdn2.thedogapi.com/images/g2tW0bptM.jpg",
        "width": 1280,
        "height": 1707
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 30",
                    "metric": "9 - 14"
                },
                "height": {
                    "imperial": "14 - 16",
                    "metric": "36 - 41"
                },
                "id": 145,
                "name": "Kooikerhondje",
                "bred_for": "Luring ducks into traps - \"tolling\"",
                "breed_group": "Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Benevolent, Agile, Alert, Intelligent, Active, Territorial",
                "reference_image_id": "kOMy84GQE"
            }
        ],
        "id": "qOXvHhXOJ",
        "url": "https://cdn2.thedogapi.com/images/qOXvHhXOJ.jpg",
        "width": 1221,
        "height": 1920
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 30",
                    "metric": "9 - 14"
                },
                "height": {
                    "imperial": "14 - 16",
                    "metric": "36 - 41"
                },
                "id": 145,
                "name": "Kooikerhondje",
                "bred_for": "Luring ducks into traps - \"tolling\"",
                "breed_group": "Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Benevolent, Agile, Alert, Intelligent, Active, Territorial",
                "reference_image_id": "kOMy84GQE"
            }
        ],
        "id": "VOmeXxwUp",
        "url": "https://cdn2.thedogapi.com/images/VOmeXxwUp.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 30",
                    "metric": "9 - 14"
                },
                "height": {
                    "imperial": "14 - 16",
                    "metric": "36 - 41"
                },
                "id": 145,
                "name": "Kooikerhondje",
                "bred_for": "Luring ducks into traps - \"tolling\"",
                "breed_group": "Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Benevolent, Agile, Alert, Intelligent, Active, Territorial",
                "reference_image_id": "kOMy84GQE"
            }
        ],
        "id": "2GdKwnTON",
        "url": "https://cdn2.thedogapi.com/images/2GdKwnTON.jpg",
        "width": 1280,
        "height": 853
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 30",
                    "metric": "9 - 14"
                },
                "height": {
                    "imperial": "14 - 16",
                    "metric": "36 - 41"
                },
                "id": 145,
                "name": "Kooikerhondje",
                "bred_for": "Luring ducks into traps - \"tolling\"",
                "breed_group": "Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Benevolent, Agile, Alert, Intelligent, Active, Territorial",
                "reference_image_id": "kOMy84GQE"
            }
        ],
        "id": "LrXQhXhmb",
        "url": "https://cdn2.thedogapi.com/images/LrXQhXhmb.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 30",
                    "metric": "9 - 14"
                },
                "height": {
                    "imperial": "14 - 16",
                    "metric": "36 - 41"
                },
                "id": 145,
                "name": "Kooikerhondje",
                "bred_for": "Luring ducks into traps - \"tolling\"",
                "breed_group": "Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Benevolent, Agile, Alert, Intelligent, Active, Territorial",
                "reference_image_id": "kOMy84GQE"
            }
        ],
        "id": "5ehdkGpsY",
        "url": "https://cdn2.thedogapi.com/images/5ehdkGpsY.jpg",
        "width": 1081,
        "height": 1920
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "130 - 180",
                    "metric": "59 - 82"
                },
                "height": {
                    "imperial": "25.5 - 27.5",
                    "metric": "65 - 70"
                },
                "id": 212,
                "name": "Saint Bernard",
                "bred_for": "Draft, search, rescue",
                "breed_group": "Working",
                "life_span": "7 - 10 years",
                "temperament": "Friendly, Lively, Gentle, Watchful, Calm",
                "reference_image_id": "_Qf9nfRzL"
            }
        ],
        "id": "KjD15MOuM",
        "url": "https://cdn2.thedogapi.com/images/KjD15MOuM.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "130 - 180",
                    "metric": "59 - 82"
                },
                "height": {
                    "imperial": "25.5 - 27.5",
                    "metric": "65 - 70"
                },
                "id": 212,
                "name": "Saint Bernard",
                "bred_for": "Draft, search, rescue",
                "breed_group": "Working",
                "life_span": "7 - 10 years",
                "temperament": "Friendly, Lively, Gentle, Watchful, Calm",
                "reference_image_id": "_Qf9nfRzL"
            }
        ],
        "id": "c2ROfi5fr",
        "url": "https://cdn2.thedogapi.com/images/c2ROfi5fr.jpg",
        "width": 1080,
        "height": 616
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "130 - 180",
                    "metric": "59 - 82"
                },
                "height": {
                    "imperial": "25.5 - 27.5",
                    "metric": "65 - 70"
                },
                "id": 212,
                "name": "Saint Bernard",
                "bred_for": "Draft, search, rescue",
                "breed_group": "Working",
                "life_span": "7 - 10 years",
                "temperament": "Friendly, Lively, Gentle, Watchful, Calm",
                "reference_image_id": "_Qf9nfRzL"
            }
        ],
        "id": "V8ZEfQ69m",
        "url": "https://cdn2.thedogapi.com/images/V8ZEfQ69m.jpg",
        "width": 768,
        "height": 1280
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "35 - 65",
                    "metric": "16 - 29"
                },
                "height": {
                    "imperial": "23 - 28",
                    "metric": "58 - 71"
                },
                "id": 213,
                "name": "Saluki",
                "bred_for": "Coursing gazelle and hare",
                "breed_group": "Hound",
                "life_span": "12 - 14 years",
                "temperament": "Aloof, Reserved, Intelligent, Quiet",
                "reference_image_id": "fjFIuehNo"
            }
        ],
        "id": "4aJ37urBz",
        "url": "https://cdn2.thedogapi.com/images/4aJ37urBz.jpg",
        "width": 1280,
        "height": 1707
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "35 - 65",
                    "metric": "16 - 29"
                },
                "height": {
                    "imperial": "23 - 28",
                    "metric": "58 - 71"
                },
                "id": 213,
                "name": "Saluki",
                "bred_for": "Coursing gazelle and hare",
                "breed_group": "Hound",
                "life_span": "12 - 14 years",
                "temperament": "Aloof, Reserved, Intelligent, Quiet",
                "reference_image_id": "fjFIuehNo"
            }
        ],
        "id": "ZjkHW13DK",
        "url": "https://cdn2.thedogapi.com/images/ZjkHW13DK.jpg",
        "width": 960,
        "height": 639
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "35 - 65",
                    "metric": "16 - 29"
                },
                "height": {
                    "imperial": "23 - 28",
                    "metric": "58 - 71"
                },
                "id": 213,
                "name": "Saluki",
                "bred_for": "Coursing gazelle and hare",
                "breed_group": "Hound",
                "life_span": "12 - 14 years",
                "temperament": "Aloof, Reserved, Intelligent, Quiet",
                "reference_image_id": "fjFIuehNo"
            }
        ],
        "id": "k0WvkHMmP",
        "url": "https://cdn2.thedogapi.com/images/k0WvkHMmP.jpg",
        "width": 1080,
        "height": 720
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "17 - 23",
                    "metric": "8 - 10"
                },
                "height": {
                    "imperial": "13.5 - 16.5",
                    "metric": "34 - 42"
                },
                "id": 222,
                "name": "Shiba Inu",
                "bred_for": "Hunting in the mountains of Japan, Alert Watchdog",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 16 years",
                "temperament": "Charming, Fearless, Keen, Alert, Confident, Faithful",
                "reference_image_id": "Zn3IjPX3f"
            }
        ],
        "id": "xcrQRb4IQ",
        "url": "https://cdn2.thedogapi.com/images/xcrQRb4IQ.jpg",
        "width": 1080,
        "height": 921
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "17 - 23",
                    "metric": "8 - 10"
                },
                "height": {
                    "imperial": "13.5 - 16.5",
                    "metric": "34 - 42"
                },
                "id": 222,
                "name": "Shiba Inu",
                "bred_for": "Hunting in the mountains of Japan, Alert Watchdog",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 16 years",
                "temperament": "Charming, Fearless, Keen, Alert, Confident, Faithful",
                "reference_image_id": "Zn3IjPX3f"
            }
        ],
        "id": "8Fs-5iUCH",
        "url": "https://cdn2.thedogapi.com/images/8Fs-5iUCH.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "17 - 23",
                    "metric": "8 - 10"
                },
                "height": {
                    "imperial": "13.5 - 16.5",
                    "metric": "34 - 42"
                },
                "id": 222,
                "name": "Shiba Inu",
                "bred_for": "Hunting in the mountains of Japan, Alert Watchdog",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 16 years",
                "temperament": "Charming, Fearless, Keen, Alert, Confident, Faithful",
                "reference_image_id": "Zn3IjPX3f"
            }
        ],
        "id": "tYnqlqNkz",
        "url": "https://cdn2.thedogapi.com/images/tYnqlqNkz.jpg",
        "width": 1080,
        "height": 1080
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "17 - 23",
                    "metric": "8 - 10"
                },
                "height": {
                    "imperial": "13.5 - 16.5",
                    "metric": "34 - 42"
                },
                "id": 222,
                "name": "Shiba Inu",
                "bred_for": "Hunting in the mountains of Japan, Alert Watchdog",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 16 years",
                "temperament": "Charming, Fearless, Keen, Alert, Confident, Faithful",
                "reference_image_id": "Zn3IjPX3f"
            }
        ],
        "id": "E2LqZL-dv",
        "url": "https://cdn2.thedogapi.com/images/E2LqZL-dv.jpg",
        "width": 1080,
        "height": 1343
    },
    {
        "breeds": [
            {
                "weight": {
                    "imperial": "20 - 24",
                    "metric": "9 - 11"
                },
                "height": {
                    "imperial": "14 - 17",
                    "metric": "36 - 43"
                },
                "id": 246,
                "name": "Tibetan Terrier",
                "bred_for": "Good luck charms, mascots, watchdogs, herding dogs, and companions",
                "breed_group": "Non-Sporting",
                "life_span": "12 - 15 years",
                "temperament": "Affectionate, Energetic, Amiable, Reserved, Gentle, Sensitive",
                "reference_image_id": "6f5n_42mB"
            }
        ],
        "id": "b-_AIs741",
        "url": "https://cdn2.thedogapi.com/images/b-_AIs741.jpg",
        "width": 750,
        "height": 750
    }
]"""
