package com.example.hodos_offline.model



import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
class LstLocation(private val data: List<Location>) {
    public fun getLocationByLabel(label: String): Location? {
        return data.firstOrNull { it.label == label }
    }


    companion object {
        fun fromJson(): LstLocation {
            val jsonString = """
            [
            {
                "id": "01d05c8b-74f3-44a1-a870-9f5463453444",
                "createdAt": "2024-12-20T22:09:19.469Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:19.469Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bún Đậu",
                "address": "140e Ly Chinh Thang Street, Ward 14, District 3",
                "description": "Bun Dau Mam Tom is a famous dish in Vietnam, popular from the North to the South. This dish typically consists of bun - a soft white vermicelli noodle paired with crispy fried tofu and flavorful shrimp paste. With its distinctive and diverse flavors, Bun Dau Mam Tom is a perfect combination of main ingredients and various vegetable such as lettuce, cucumber, chili, and perilla. Additionally, in some places, this dish is often served with other side dishes like green sticky rice patties. (Cha Com), fried fermented pork roll (Nem Chua Ran), etc. With its rich and varied taste profiles, Bun Dau Mam Tom is one of the most attractive and popular dishes in Vietnamese cuisine.",
                "label": "",
                "lstImgs": [
                "https://dauhomemade.vn/apps/uploads/2018/09/da%CC%82%CC%80y-du%CC%89-scaled-e1672490363436.jpg"
                ],
                "coordinates": "10.787226014226572, 106.68470714858121",
                "type": "FOOD",
                "img": "https://dauhomemade.vn/apps/uploads/2018/09/da%CC%82%CC%80y-du%CC%89-scaled-e1672490363436.jpg"
            },
            {
                "id": "03bb6a0b-34d8-411c-85e3-a6a9debbc9cd",
                "createdAt": "2024-12-20T22:09:22.062Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:22.062Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Chim Cút Quay",
                "address": "286 Vo Van Kiet Street, Cau Ong Lanh Ward, District 1, Ho Chi Minh City",
                "description": "Cút Chiên Bơ, or butter-fried quail, is a Vietnamese delicacy where quail is marinated and fried in butter, resulting in a rich, savory flavor with a crispy exterior.",
                "label": "",
                "lstImgs": [
                "https://giadinh.mediacdn.vn/fo0kTGzs4vdeV69TnPGgBuNDbjI878/Image/2012/03/chim1_e4d0a.jpg"
                ],
                "coordinates": "10.762487, 106.696701",
                "type": "FOOD",
                "img": "https://giadinh.mediacdn.vn/fo0kTGzs4vdeV69TnPGgBuNDbjI878/Image/2012/03/chim1_e4d0a.jpg"
            },
            {
                "id": "08c0f1f4-3392-43b7-bd1d-1e2d27bac933",
                "createdAt": "2024-12-20T22:09:21.327Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.327Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Ốc",
                "address": "12/29 Lữ Gia, phường 15, quận 11, TP. HCM",
                "description": "Ốc Luộc is a simple yet satisfying Vietnamese dish featuring boiled snails. They're often served with a flavorful dipping sauce made with chili, lime, and fish sauce, adding a tangy and spicy kick.",
                "label": "",
                "lstImgs": [
                "https://giadinh.mediacdn.vn/FYwJ7viWNMAlcII9V7lP1vv6LIIMi/Image/2012/08/oc-luoc_215e3.jpg"
                ],
                "coordinates": "10.770597, 106.656776",
                "type": "FOOD",
                "img": "https://giadinh.mediacdn.vn/FYwJ7viWNMAlcII9V7lP1vv6LIIMi/Image/2012/08/oc-luoc_215e3.jpg"
            },
            {
                "id": "0d4ca6d8-8d20-4bc0-ad5c-f1199bdcc06d",
                "createdAt": "2024-12-20T22:09:20.189Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.189Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bắp Xào",
                "address": "2/24C Cao Thang Street, Ward 2, District 3",
                "description": "Bap Xao, a street food dish, is quite famous in Vietnam. Corn kernels, after being boiled until tender, are stir-fried with butter, fried scallions, dried shrimp, shredded pork, and scallions. What sets this dish apart is the sweet taste of the corn kernels combined with the creamy richness of butter and the delicious flavor of dried shrimp, creating a unique taste profile. It can be said that corn stir-fry is a simple yet captivating dish. It offers an enjoyable experience for visitors.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2021/08/CookProduct/thumbcn-1200x676-14.jpg"
                ],
                "coordinates": "10.768416590857216, 106.68415210671512",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2021/08/CookProduct/thumbcn-1200x676-14.jpg"
            },
            {
                "id": "0ffd55cf-f571-48b2-a395-4c6aa899cf98",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Turtle Lake",
                "address": "the intersection of Tran Cao Van, Pham Ngoc Thach,\r\nVo Van Tan streets in District 3, Ho Chi Minh City.",
                "description": "The Turtle Lake, officially known as the International Plaza, holds a prime location at the intersection of three bustling streets: Pham Ngoc Thach, Vo Van Tan, and Tran Cao Van, forming a convenient roundabout for commuting. Situated in the heart of the city, Turtle Lake is a popular tourist attraction drawing both locals and foreign visitors alike. Additionally, another highlight of this area is the bustling commercial activities surrounding the lake, especially the street food stalls around Turtle Lake. The diverse culinary offerings here always inspire numerous reviews and famous vlogs.",
                "label": "Turtle_Lake",
                "lstImgs": [
                "https://www.visithcmc.vn/uploads/0000/6/2021/10/06/12-khu-ho-con-rua-photo-by-hien-phung-thu-shutterstock-1328768591-16-9-watermark.jpg",
                " https://travelsgcc.com/wp-content/uploads/2020/03/ho-con-rua.jpg",
                " https://thanhnien.mediacdn.vn/Uploaded/dongns/2022_03_21/ho-con-rua-6599.jpg"
                ],
                "coordinates": "10.7826283,106.6948463",
                "type": "LOCATION",
                "img": "https://www.visithcmc.vn/uploads/0000/6/2021/10/06/12-khu-ho-con-rua-photo-by-hien-phung-thu-shutterstock-1328768591-16-9-watermark.jpg"
            },
            {
                "id": "154d8783-9a6b-4b79-a90b-2be993787c80",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Saigon Zoo and Botanical Gardens",
                "address": "2 Nguyen Binh Khiem, Ben Nghe Ward, District 1",
                "description": "Saigon Zoo and Botanical Gardens is one of Vietnam's oldest amusement parks and also the largest botanical garden in Saigon, serving as a conservation area for flora and fauna. Saigon Zoo and Botanical Gardens is a renowned zoo with numerous rare and precious species, boasting 590 individuals of 125 species of animals, and 1,800 woody plants of 260 species. The zoo is divided into various areas such as carnivores, mammals, reptiles, herbivores, birds, small animals, and more. Additionally, visitors can participate in thrilling rides, enjoy spectacular magic shows, musical performances, animal circus acts, and other exciting activities. Moreover, the park offers a refreshing atmosphere and tranquil spaces for relaxation. Saigon Zoo and Botanical Gardens opens from 7:00 to 17:30 every day of the week.",
                "label": "Saigon_Zoo_and_Botanical_Gardens",
                "lstImgs": [
                "https://static.vinwonders.com/production/thao-cam-vien-1.jpg",
                " https://nads.1cdn.vn/2024/01/01/1.jpg",
                " https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2023/3/16/1158477/IMG_8725-2.jpg"
                ],
                "coordinates": "10.7874215,106.7049922",
                "type": "LOCATION",
                "img": "https://static.vinwonders.com/production/thao-cam-vien-1.jpg"
            },
            {
                "id": "19f3c3aa-074c-4207-b846-0db21f3fe167",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Notre-Dame Cathedral Basilica of Saigon",
                "address": "01 Cong xa Paris Street, Ben Nghe Ward, District 1",
                "description": "The Saigon Notre-Dame Cathedral Basilica is one of the landmark buildings of Ho Chi Minh City. Located in the heart of the city, it was built in the late 19th century. The architecture of the cathedral is a blend of Romanesque and Gothic styles, exuding classical and elegant features. Its facade boasts two bell towers towering approximately 57 meters high, housing a set of six bells (Do, Re, Mi, Fa, Sol, La). In the garden square in front of the cathedral stands a 4.6-meter-tall, 8-ton statue of Virgin Mary, regarded as the symbol of the Notre-Dame Cathedral. On weekdays, the cathedral holds two masses, one at 5:30 am and another in the evening at 5:30 pm. On Sundays, there are seven masses scheduled at 5:30 am, 6:45 am, 8 am, 9:30 am (English mass), 4 pm, 5:30 pm, and 6:30 pm.\"\r\n\r\n",
                "label": "Notre_Dame_Cathedral_Basilica_of_Saigon",
                "lstImgs": [
                "https://ik.imagekit.io/tvlk/blog/2023/01/nha-tho-duc-ba-3.jpg",
                " https://www.vietnamonline.com/media/uploads/froala_editor/images/VNO-nhathoducbasg1.jpg",
                " https://localvietnam.com/wp-content/uploads/2023/06/saigon-notre-dame-cathedral-3.jpg"
                ],
                "coordinates": "10.7797855,106.6990189",
                "type": "LOCATION",
                "img": "https://ik.imagekit.io/tvlk/blog/2023/01/nha-tho-duc-ba-3.jpg"
            },
            {
                "id": "1ee45401-1243-4cbe-8681-cd908946d6c8",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Fine Arts Museum",
                "address": "97a Pho Duc Chinh Street, Nguyen Thai Binh Ward, District 1",
                "description": "The Ho Chi Minh City Museum of Fine Arts is an ideal stop for those with a love for culture and a passion for art. Established in 1987, it officially opened its doors to visitors in 1989, quickly becoming a renowned tourist destination in Saigon, attracting a large number of visitors. Spanning an area of 3,514 square meters, the museum features unique Art Deco architecture with three main buildings. This architectural style is remarkable and distinctive, harmoniously blending the artistic beauty of both Europe and Asia. With a collection of over 22,000 valuable artifacts, the museum houses a wealth of artistic treasures. Visitors can explore and discover various precious collections during their visit. The museum is open from 8:00 AM to 5:00 PM every day of the week.",
                "label": "Fine_Arts_Museum",
                "lstImgs": [
                "https://cdn.vntrip.vn/cam-nang/wp-content/uploads/2017/09/1-4.jpg",
                " https://cdn3.ivivu.com/2022/10/Bao-tang-My-thuat-TP-HCM-ivivu.jpg",
                " https://toquoc.mediacdn.vn/2020/10/12/img0931-16019911462221986475118-1602506369181-16025063691811609033143.jpg"
                ],
                "coordinates": "10.7700573,106.6981213",
                "type": "LOCATION",
                "img": "https://cdn.vntrip.vn/cam-nang/wp-content/uploads/2017/09/1-4.jpg"
            },
            {
                "id": "20e8f378-1220-4961-8679-31ca0c7d3cdf",
                "createdAt": "2024-12-20T22:09:20.534Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.534Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Phở Bò",
                "address": "25 Mac Dinh Chi, Da Kao Ward, District 1",
                "description": "Pho is a traditional and iconic dish of Vietnamese cuisine, known worldwide. This dish consists of soft pho noodles, combined with thinly sliced beef, and a flavorful broth made from beef bones, spices such as onions, ginger, star anise, cinnamon, and chili, creating a distinctive and delicious flavor. Pho is often served with fresh herbs like bean sprouts, cilantro, basil, and chili, along with a side of sweet and sour fish sauce and lime, creating a culinary experience that is rich and diverse. In some places, chicken can also be used as a substitute for beef, adding to the variety of the dish. With its distinctive flavor, Pho is not only a delicious dish but also a symbol of Vietnamese culinary culture, providing diners with a rich and impressive culinary experience.",
                "label": "",
                "lstImgs": [
                "https://tiki.vn/blog/wp-content/uploads/2023/07/thumb-12.jpg"
                ],
                "coordinates": "10.784740847045152, 106.69934328575526",
                "type": "FOOD",
                "img": "https://tiki.vn/blog/wp-content/uploads/2023/07/thumb-12.jpg"
            },
            {
                "id": "24442414-c305-4256-bcfe-914d8ffac187",
                "createdAt": "2024-12-20T22:09:20.805Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.805Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Chả Cá Lã Vọng",
                "address": "7 Ho Xuan Huong Street, Ward 6, District 3, Ho Chi Minh City",
                "description": "Chả Cá Lã Vọng is a renowned dish from northern Vietnam, featuring grilled turmeric-marinated fish, typically served with dill, rice vermicelli, peanuts, and herbs. The fish is cooked tableside in a sizzling pan and paired with shrimp paste or fish sauce. This unique dish reflects the rich culinary heritage of Hanoi and is a must-try for visitors seeking authentic Vietnamese flavors.",
                "label": "",
                "lstImgs": [
                "https://www.cet.edu.vn/wp-content/uploads/2018/08/cha-ca-la-vong.jpg"
                ],
                "coordinates": "10.7778802,106.6880324",
                "type": "FOOD",
                "img": "https://www.cet.edu.vn/wp-content/uploads/2018/08/cha-ca-la-vong.jpg"
            },
            {
                "id": "3140b850-ab66-4600-af4e-61efa6396d76",
                "createdAt": "2024-12-20T22:09:21.792Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.792Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bò Né",
                "address": "18 Đinh Tiên Hoàng Street, Đa Kao Ward, District 1, Ho Chi Minh City",
                "description": "Bò Né is a sizzling Vietnamese dish featuring marinated beef, eggs, and vegetables served on a hot plate. It's often enjoyed with a crispy baguette, making for a flavorful and interactive meal.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/Files/2020/10/12/1298229/an-sap-5-tiem-bo-ne-thom-ngon-duoc-yeu-thich-nhat-quan-1-202201060928336213.jpg"
                ],
                "coordinates": "10.788334, 106.699734",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/Files/2020/10/12/1298229/an-sap-5-tiem-bo-ne-thom-ngon-duoc-yeu-thich-nhat-quan-1-202201060928336213.jpg"
            },
            {
                "id": "3ba9142a-e53f-4b30-b8b8-a9425d7f3dcf",
                "createdAt": "2024-12-20T22:09:21.123Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.123Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Hột Vịt Lộn",
                "address": "104 Xuân Thủy, Thảo Điền, quận 2",
                "description": "Hột Vịt Lộn is a popular Vietnamese street food consisting of a boiled, fertilized duck egg with a partially developed embryo inside. It's considered a source of protein and energy, often served with a spicy dipping sauce.",
                "label": "",
                "lstImgs": [
                "https://danviet.mediacdn.vn/296231569849192448/2023/10/27/anh-4-4-16983849474102141906520.jpg"
                ],
                "coordinates": "10.803916, 106.735585",
                "type": "FOOD",
                "img": "https://danviet.mediacdn.vn/296231569849192448/2023/10/27/anh-4-4-16983849474102141906520.jpg"
            },
            {
                "id": "3cc522c5-ee8b-4484-a610-a46c8d9f0f0e",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Tan Dinh Church",
                "address": "289 Hai Ba Trung Street, Vo Thi Sau Ward, District 3",
                "description": "Tan Dinh Church is one of the famous Catholic churches in Saigon. It was constructed in an impressive Gothic style combined with many details decorated in the Roman and Baroque styles. The façade of the church consists of a main tower towering 52.6 meters high accompanied by two auxiliary towers. Additionally, the characteristic Gothic architecture has bestowed upon the Cathedral of Tan Dinh Church an extremely solemn and majestic appearance. After several renovations, the church has been coated with a pastel pink color, which has brought a special charm to it. Visitors come to Tan Dinh Church not only to pray for peace and blessings but also to enjoy the peaceful and serene atmosphere in this holy place.",
                "label": "Tan_Dinh_Church",
                "lstImgs": [
                "https://ik.imagekit.io/tvlk/blog/2023/09/nha-tho-tan-dinh-12.jpg",
                " https://ik.imagekit.io/tvlk/blog/2023/09/nha-tho-tan-dinh-11.jpg",
                " https://www.visithcmc.vn/uploads/0000/6/2023/09/11/nha-tho-tan-dinh.jpg"
                ],
                "coordinates": "10.7886713,106.6902443",
                "type": "LOCATION",
                "img": "https://ik.imagekit.io/tvlk/blog/2023/09/nha-tho-tan-dinh-12.jpg"
            },
            {
                "id": "3f3b6b5a-2f2f-4a54-af96-6f83e83067c5",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "War Remnants Museum",
                "address": "28 Vo Van Tan Street, Vo Thi Sau Ward, District 3",
                "description": "The War Remnants Museum is an emotionally charged historical treasure, preserving the traces of conflicts and resistance spanning centuries, deeply ingrained in the history of the Vietnamese people. It is the unique museum in Vietnam to systematically study, collect, conserve and display exhibits on war crimes and consequences inflicted on the Vietnamese people by foreign aggressive forces. Simultaneously, the Museum appeals to everybody to oppose unjust wars, preserve global peace, promote friendship and solidarity among nations. The Museum is endowed with 9 permanent thematic exhibitions and various special collections. All year round, a wide range of activities are organized, including conferences, meetings with war witnesses, temporary and itinerant exhibitions. With nearly one million domestic and international visitors per year, The War Remnants Museum is one of Ho Chi Minh City's most enticing cultural and tourist sites. The museum is open daily from 7:30 AM to 6:00 PM.",
                "label": "War_Remnants_Museum",
                "lstImgs": [
                "https://hoabinhphuquoc.com.vn/files/files/Tin%20tuc/bang-tang-chung-tich-chien-tranh-3.jpg",
                " https://ik.imagekit.io/tvlk/blog/2023/04/bao-tang-chung-tich-chien-tranh-1.jpg",
                " https://upload.wikimedia.org/wikipedia/commons/8/84/B%E1%BA%A3o_t%C3%A0ng_ch%E1%BB%A9ng_t%C3%ADch_chi%E1%BA%BFn_tranh%2C_tp_Ho_chi_minh_vietnam%2C_vo_Van_tan_-_panoramio.jpg"
                ],
                "coordinates": "10.7796633,106.6916423",
                "type": "LOCATION",
                "img": "https://hoabinhphuquoc.com.vn/files/files/Tin%20tuc/bang-tang-chung-tich-chien-tranh-3.jpg"
            },
            {
                "id": "578a8540-00f1-4ea0-9b8a-00e6d9f8efde",
                "createdAt": "2024-12-20T22:09:20.593Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.593Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bún Bò",
                "address": "585 Huynh Tan Phat, Tan Thuan Dong Ward, District 7",
                "description": "Bun Bo is an extremely popular dish in Vietnam. A bowl of Bun Bo typically consists of rice vermicelli noodles, beef brisket, and depending on the region, there may be other accompanying dishes as well,... The \"soul\" of bun Bo lies in its broth. The broth is simmered from beef bones, giving it a rich and sweet flavor. Additionally, a bit of shrimp paste and lemongrass are added to the broth to enhance its aroma. When enjoying this dish, it's common to eat it with water spinach, bean sprouts,... This is a dish that every diner should not miss when visiting VietNam.",
                "label": "",
                "lstImgs": [
                "https://digifood.vn/blog/wp-content/uploads/2021/12/Cach-nau-bun-bo-mien-Bac-6.jpg"
                ],
                "coordinates": "10.74106440390663, 106.73004354086663",
                "type": "FOOD",
                "img": "https://digifood.vn/blog/wp-content/uploads/2021/12/Cach-nau-bun-bo-mien-Bac-6.jpg"
            },
            {
                "id": "58d02a30-b532-4b82-9173-eb8aacb7fe8f",
                "createdAt": "2024-12-20T22:09:21.995Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.995Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Nem Lụi",
                "address": "91 Hai Ba Trung Street, Ben Nghe Ward, District 1, Ho Chi Minh City",
                "description": "Nem Lụi is a Vietnamese dish consisting of grilled pork skewers, typically served with rice paper, fresh herbs, and a flavorful dipping sauce. The pork is seasoned and wrapped around lemongrass sticks, giving it a unique aroma and taste. It's a popular dish for its savory flavor and interactive dining experience.",
                "label": "",
                "lstImgs": [
                "https://i-giadinh.vnecdn.net/2022/02/18/Buoc-6-5410-1645174529.jpg"
                ],
                "coordinates": "10.777176, 106.704347",
                "type": "FOOD",
                "img": "https://i-giadinh.vnecdn.net/2022/02/18/Buoc-6-5410-1645174529.jpg"
            },
            {
                "id": "60cfc828-4cba-4eba-8e1b-1b26335d606d",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bui Vien Street",
                "address": "Bui Vien Street, Pham Ngu Lao Ward, District 1",
                "description": "Bui Vien Walking Street, a lively entertainment hub at night, is extremely popular with both local and international tourists. It is considered an excellent choice for those who enjoy vibrant and bustling environments. The street spans approximately 850 meters along Bui Vien Road, and when you visit, you'll experience the fantastic atmosphere characteristic of Saigon's nightlife. Moreover, another highlight that attracts a large number of tourists to this area is the delicious food offerings.",
                "label": "Bui_Vien_Street",
                "lstImgs": [
                "https://darejourney.com/uploads/2023/12/IMG_20231201_010626_076.jpg",
                " https://saigonvibes.com/wp-content/uploads/2023/09/quan-an-ngon-o-sai-gon-lua-dai-viet.jpg",
                " https://vietnamdiscovery.com/wp-content/uploads/2021/02/Bui-Vien-street.jpg"
                ],
                "coordinates": "10.7667353,106.6918203",
                "type": "LOCATION",
                "img": "https://darejourney.com/uploads/2023/12/IMG_20231201_010626_076.jpg"
            },
            {
                "id": "62176b7b-c896-413d-8723-1d27f043f109",
                "createdAt": "2024-12-20T22:09:22.347Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:22.347Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bắp Nướng Mỡ Hành",
                "address": "33/40 Cao Thang Street, Ward 5, District 3, Ho Chi Minh City",
                "description": "Bắp Nướng Mỡ Hành is a Vietnamese street food favorite featuring grilled corn on the cob topped with a savory mix of scallion oil and sometimes crushed peanuts. The combination of smoky, sweet corn with the rich, aromatic scallion oil makes it a delicious and popular snack.",
                "label": "",
                "lstImgs": [
                "https://thannuongsach.com/profiles/thannuongsachcom/uploads/attach/1478942550_ngo-nuong-mo-hanh-ngon.jpg"
                ],
                "coordinates": "10.770561, 106.684163",
                "type": "FOOD",
                "img": "https://thannuongsach.com/profiles/thannuongsachcom/uploads/attach/1478942550_ngo-nuong-mo-hanh-ngon.jpg"
            },
            {
                "id": "66d013bd-c4b5-428f-978a-493ca195b881",
                "createdAt": "2024-12-20T22:09:20.868Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.868Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Bao",
                "address": "78-80 D. Nguyen Tri Phuong Street, Ward 7, District 5, Ho Chi Minh City",
                "description": "Bánh Bao is a Vietnamese steamed bun filled with a variety of savory ingredients, typically including pork, quail eggs, and Chinese sausage. The soft, fluffy bun encases a flavorful filling, often spiced with shallots and mushrooms. This versatile snack is enjoyed for breakfast or as a light meal, reflecting the influence of Chinese cuisine on Vietnamese street food culture.",
                "label": "",
                "lstImgs": [
                "https://thophat.com/wp-content/uploads/2022/03/BB-Thit-Heo-Trung-Muoi-170g-1.jpg"
                ],
                "coordinates": "10.753032, 106.669588",
                "type": "FOOD",
                "img": "https://thophat.com/wp-content/uploads/2022/03/BB-Thit-Heo-Trung-Muoi-170g-1.jpg"
            },
            {
                "id": "67835c8a-8b31-4697-8ef8-649ea7662944",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Buu Long Pagoda",
                "address": "81 Nguyen Xien Street, Long Binh Ward, District 9",
                "description": "\r\nBuu Long Pagoda is one of the most uniquely designed temples, reminiscent of the Golden Temple in Thailand. According to the sharing of Master Vien Minh, the temple was inspired by the architectural style of Buddhism originating from India. Situated in the temple's courtyard is a large lake. Directly behind the lake stands the 56-meter-tall Gotama Cetiya tower. This tower is also hailed as the largest stupa in Vietnam. Apart from its distinctive architectural features, the pagoda is perched atop a hill, offering visitors not only a sense of serenity but also refreshing, clean air. This is truly a spiritual tourism destination that visitors to Ho Chi Minh City cannot miss. The pagoda is open to visitors from 8:00 AM to 6:00 PM daily.",
                "label": "Buu_Long_Pagoda",
                "lstImgs": [
                "https://static.vinwonders.com/production/chua-buu-long-banner.jpg",
                " https://r2.nucuoimekong.com/wp-content/uploads/chua-thai-quan-9.jpg",
                " https://cdn.vntrip.vn/cam-nang/wp-content/uploads/2017/09/chua-buu-long.jpg"
                ],
                "coordinates": "10.8790312,106.8300551",
                "type": "LOCATION",
                "img": "https://static.vinwonders.com/production/chua-buu-long-banner.jpg"
            },
            {
                "id": "6f813401-a41e-43d2-b765-41d2f2370e5b",
                "createdAt": "2024-12-20T22:09:20.255Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.255Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Hủ Tiếu",
                "address": "232 Nguyen Thi Thap, Binh Thuan Ward, District 7",
                "description": "Hu Tieu Nam Vang is a popular dish in the Southern region of Vietnam, especially in Saigon. A bowl of Hu Tieu Nam Vang typically contains a variety of ingredients and a delicious broth. The distinctive feature of Hu Tieu Nam Vang lies in the intricate process of preparing the broth, which involves simmering pork bones with dried squid and dried shrimp. A bowl of Hu Tieu Nam Vang usually includes: rice noodles, pork liver, shrimp, minced meat, fresh vegetables, and a flavorful broth. Hu Tieu Nam Vang can be eaten in two ways: by pouring the broth directly onto the noodles or not. Its unique flavor profile makes Hu Tieu Nam Vang a dish that travelers should not miss out on.",
                "label": "",
                "lstImgs": [
                "https://tiki.vn/blog/wp-content/uploads/2023/07/hu-tieu-nam-vang-xuat-xu-o-dau-1024x576.jpg"
                ],
                "coordinates": "10.739349638649403, 106.71842805927797",
                "type": "FOOD",
                "img": "https://tiki.vn/blog/wp-content/uploads/2023/07/hu-tieu-nam-vang-xuat-xu-o-dau-1024x576.jpg"
            },
            {
                "id": "75f4756a-d4f5-4712-90dd-4d482dde4a1b",
                "createdAt": "2024-12-20T22:09:21.659Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.659Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Cam",
                "address": "47C Nguyễn Phi Khanh Street, Tân Định Ward, District 1, Ho Chi Minh City",
                "description": "Bánh Cam are crispy, deep-fried rice balls coated in sesame seeds, filled with sweet mung bean paste. They offer a delightful mix of crunchy and chewy textures, making them a popular Vietnamese snack.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2021/03/CookProduct/1200-1200x676-72.jpg"
                ],
                "coordinates": "10.791748, 106.694114",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2021/03/CookProduct/1200-1200x676-72.jpg"
            },
            {
                "id": "7626236c-df20-4fbc-8cb3-1d6a7fcc05d3",
                "createdAt": "2024-12-20T22:09:20.458Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.458Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Phá Lấu",
                "address": "243/37A Ton Dan, Ward 15, District 4",
                "description": "Bun Mam is one of the specialties of the Mekong Delta region in Vietnam. It is cooked using fermented fish sauce made from either Linh fish or Sac fish. This dish is a combination of rice vermicelli noodles, various vegetables such as water lilies, water spinach, bean sprouts, etc., along with a rich variety of ingredients like shrimp, squid, roasted pork,... It is particularly suitable for diners who enjoy bold and intense flavors. And it's precisely this richness in flavor that gives it its uniqueness. Bun Mam is definitely a dish worth experiencing.",
                "label": "",
                "lstImgs": [
                "https://maisonmando.com/wp-content/uploads/2022/04/pha-lau-la-mon-gi-1.jpg"
                ],
                "coordinates": "10.793998802225172, 106.70671882621231",
                "type": "FOOD",
                "img": "https://maisonmando.com/wp-content/uploads/2022/04/pha-lau-la-mon-gi-1.jpg"
            },
            {
                "id": "788d0221-898f-4850-9677-ae00d2d0b58d",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Ben Thanh Market",
                "address": "Ben Thanh Ward, District 1",
                "description": "Ben Thanh Market is an iconic landmark of Ho Chi Minh City. The market was built in 1870 and still retains its ancient architecture and traditional features. Located in the city center, Bến Thành Market covers an area of 13,000m2 with 4 main entrances facing 4 streets and 12 side entrances. There are over 1500 stalls selling various items such as food, clothing, souvenirs, etc. The market operates from 7:30 am to 6 pm. After 7 pm, the night market outside the main building begins its activities",
                "label": "Ben_Thanh_Market",
                "lstImgs": [
                "https://static.vinwonders.com/production/cho-ben-thanh-1.jpg",
                " https://vcdn-vnexpress.vnecdn.net/2023/04/30/233A4498-2-2447-1682843979.jpg",
                " https://cdn3.ivivu.com/2022/10/cho_ben_thanh_ivivu.jpg"
                ],
                "coordinates": "10.77211,106.69827",
                "type": "LOCATION",
                "img": "https://static.vinwonders.com/production/cho-ben-thanh-1.jpg"
            },
            {
                "id": "7eb5207d-861e-4fa1-a700-159cee5157c6",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Vinh Nghiem Pagoda",
                "address": "339 Nam Ky Khoi Nghia Street, Ward 7, District 3",
                "description": "Vinh Nghiem Pagoda is a well-known Buddhist temple in Saigon. It was built in 1964, taking inspiration from the ancient temple of the same name in Bac Giang province, and has been operational since 1971. Designed by architect Nguyen Ba Lang, the temple spans over 6000 square meters and features various scenic spots and unique structures such as the Three-Gate Entrance and Vinh Nghiem Stone Tower. Aside from sightseeing and worshiping, visitors to Vinh Nghiem Pagoda can also participate in meaningful community activities organized at the temple. Every year, the pagoda hosts charitable events such as charity cooking. Vinh Nghiem Pagoda welcomes visitors for sightseeing and worship from 7:00 AM to 7:00 PM daily.",
                "label": "Vinh_Nghiem_Pagoda",
                "lstImgs": [
                "https://www.visithcmc.vn/uploads/0000/6/2023/10/11/b2ap3-large-vinh-nghiem-pagoda-ho-chi-minh-1.jpg",
                " http://www.chuaviettoancau.com/userfiles/207_01.jpg",
                " https://tunglahan.com.vn/upload/images/e3f49301e9b621e878a7.jpg"
                ],
                "coordinates": "10.7907625,106.6825394",
                "type": "LOCATION",
                "img": "https://www.visithcmc.vn/uploads/0000/6/2023/10/11/b2ap3-large-vinh-nghiem-pagoda-ho-chi-minh-1.jpg"
            },
            {
                "id": "8355b0f0-d599-4677-bab8-7cdeac10d89d",
                "createdAt": "2024-12-20T22:09:22.278Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:22.278Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Tét",
                "address": "167 Nguyen Thi Minh Khai Street, Pham Ngu Lao Ward, District 1, Ho Chi Minh City",
                "description": "Bánh Tét is a traditional Vietnamese cake made from glutinous rice, typically filled with mung bean paste and pork, then wrapped in banana leaves and boiled. It's a popular dish during the Lunar New Year, known for its savory flavor and sticky texture, symbolizing prosperity and unity.",
                "label": "",
                "lstImgs": [
                "https://www.allrecipes.com/thmb/FCKEjB9XssSScNEPEcdzNJNmGtM=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/284441_BanhTet_MFS_191-691a33e885fd49849c35234156126a27.jpg"
                ],
                "coordinates": "10.770609, 106.686623",
                "type": "FOOD",
                "img": "https://www.allrecipes.com/thmb/FCKEjB9XssSScNEPEcdzNJNmGtM=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/284441_BanhTet_MFS_191-691a33e885fd49849c35234156126a27.jpg"
            },
            {
                "id": "8a43bfdc-1e41-43a3-8163-ec224a774bfd",
                "createdAt": "2024-12-20T22:09:19.964Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:19.964Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Giò",
                "address": "55/24B Phan Dinh Phung Street, Ward 17, Phu Nhuan District",
                "description": "Banh Gio is an extremely famous dish in Vietnam, especially in Hanoi. Banh Gio is made very simply with the outer layer being made of rice flour along with a filling of minced pork, wood ear mushrooms, shallots, and pepper. The cake is wrapped in banana leaves and steamed. It is typically enjoyed while still hot because that's when it tastes the best. In some places, Banh Gio is also served with various accompaniments such as pickled vegetables, cucumber, grilled meat, and Vietnamese sausage, making the dish even more appealing. With those aspects, Banh Gio would indeed be an exciting experience for tourists to try.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2021/05/CookProduct/Banh-gio-la-gi-an-kem-voi-gi-banh-gio-bao-nhieu-calo-1-1200x676.jpg"
                ],
                "coordinates": "10.7654950713523, 106.69652482411226",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2021/05/CookProduct/Banh-gio-la-gi-an-kem-voi-gi-banh-gio-bao-nhieu-calo-1-1200x676.jpg"
            },
            {
                "id": "8de64ca8-fedb-45b8-bfde-b7095c3f161c",
                "createdAt": "2024-12-20T22:09:21.389Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.389Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Khoai Lang Nướng",
                "address": "Hẻm 268 Lý Thái Tổ, Phường 1, Quận 3, TPHCM",
                "description": "A simple yet comforting street food, Khoai Lang Nướng is grilled sweet potato, often drizzled with condensed milk for extra sweetness. It's a warm and satisfying snack, enjoyed for its natural sweetness and soft texture.",
                "label": "",
                "lstImgs": [
                "https://vov.vn/sites/default/files/styles/large/public/2023-12/khoai1.jpg"
                ],
                "coordinates": "10.767536, 106.676502",
                "type": "FOOD",
                "img": "https://vov.vn/sites/default/files/styles/large/public/2023-12/khoai1.jpg"
            },
            {
                "id": "8fe93b8a-3737-47ee-b8a6-c3dbb00f05b2",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bitexco Financial Tower",
                "address": "02 Hai Trieu Street, Ben Nghe Ward, District 1",
                "description": "The Bitexco Financial Tower, commonly referred to as the Bitexco Tower, stands as an iconic architectural marvel in Ho Chi Minh City, Vietnam. Soaring nearly 270 meters high with 68 floors, the distinctive architecture of the Bitexco Financial Tower draws inspiration from the lotus bud, a symbol of purity and a bright future in Vietnamese culture. The Bitexco Tower is a prime example of creativity and unique design. It serves as a captivating destination for both locals and international visitors. One of the highlights of this building that tourists should not miss is the SaiGon Skydeck observation deck on the 49th floor. The Bitexco Financial Tower is open from Monday to Sunday, from 9:30 am to 9:30 pm",
                "label": "Bitexco_Financial_Tower",
                "lstImgs": [
                "https://vinasclaw.vn/wp-content/uploads/2020/09/Set-up-company-in-Bitexco-Financial-Tower1.jpg",
                " https://static.vecteezy.com/system/resources/previews/010/058/661/large_2x/ho-chi-minh-vietnam-feb-19-2022-view-of-bitexco-financial-tower-building-buildings-roads-thu-thiem-bridge-and-saigon-river-in-ho-chi-minh-city-in-sunset-high-quality-panorama-image-free-photo.jpg",
                " https://vinasclaw.vn/wp-content/uploads/2020/09/Set-up-company-in-Bitexco-Financial-Tower1.jpg"
                ],
                "coordinates": "10.7716883,106.7034298",
                "type": "LOCATION",
                "img": "https://vinasclaw.vn/wp-content/uploads/2020/09/Set-up-company-in-Bitexco-Financial-Tower1.jpg"
            },
            {
                "id": "91ad4b30-407a-4bcc-91a5-7f50173e0a4d",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Nha Rong Harbor",
                "address": "1 Nguyen Tat Thanh Street, Ward 12, District 4",
                "description": "Nha Rong Harbor is renowned for its significant historical importance, being part of President Ho Chi Minh's journey to seek the liberation of the Vietnamese people. Additionally, another notable feature of this place is the skillful combination of Eastern architecture, creating a unique beauty that harmonizes Asian and European elements. There are four main areas here: the Ho Chi Minh Museum, the statue of Uncle Ho, the port yard, and the fountain square. Among them, the Ho Chi Minh Museum stands out as it houses valuable artifacts and documents related to President Ho Chi Minh. Furthermore, its prime location directly overlooking the Saigon River makes the port area possess a spacious and airy courtyard, perfect for leisurely walks. Nha Rong Harbor is open from 7:30 am to 11:30 am in the morning and from 1:30 pm to 5:30 pm in the afternoon from Tuesday to Sunday every week.",
                "label": "Nha_Rong_Harbor",
                "lstImgs": [
                "https://image.vietgoing.com/editor/image_rwh1622796161.jpg",
                " https://homepage.momocdn.net/blogscontents/momo-upload-api-220805115425-637952972653147029.jpg",
                " https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2023/4/28/1185683/4-VHTT-1002754-01.jpg"
                ],
                "coordinates": "10.7681513,106.7063473",
                "type": "LOCATION",
                "img": "https://image.vietgoing.com/editor/image_rwh1622796161.jpg"
            },
            {
                "id": "93ca7618-4a57-40be-b0ce-25218f9b9a95",
                "createdAt": "2024-12-20T22:09:20.738Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.738Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Cao lầu",
                "address": "872/25 Quang Trung Street, Go Vap District",
                "description": "Chả Cá Lã Vọng is a renowned dish from northern Vietnam, featuring grilled turmeric-marinated fish, typically served with dill, rice vermicelli, peanuts, and herbs. The fish is cooked tableside in a sizzling pan and paired with shrimp paste or fish sauce. This unique dish reflects the rich culinary heritage of Hanoi and is a must-try for visitors seeking authentic Vietnamese flavors.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2021/12/CookDish/cao-lau-la-gi-nguon-goc-cao-lau-cao-lau-va-mi-quang-khac-nhau-avt-1200x676.jpg",
                "https://static.vinwonders.com/2022/10/cao-lau-hoi-an-banner.jpg",
                "https://i-giadinh.vnecdn.net/2023/03/13/Buoc-7-Thanh-pham-1-7-9577-1678700377.jpg"
                ],
                "coordinates": "10.838984200809895, 106.65269808517955",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2021/12/CookDish/cao-lau-la-gi-nguon-goc-cao-lau-cao-lau-va-mi-quang-khac-nhau-avt-1200x676.jpg"
            },
            {
                "id": "9589b829-f243-4f3d-9910-df90aa0b5963",
                "createdAt": "2024-12-20T22:09:19.539Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:19.539Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Tráng Nướng",
                "address": "386/43B Le Van Si Street, Ward 14, District 3",
                "description": "Bánh tráng nướng is a popular and traditional street food in Vietnam. It is typically made from fresh or dried rice paper. The rice paper is evenly coated with ingredients such as eggs, scallion oil, spices, fish cake, dried shrimp, dried squid, fried shallots, and other seasonings. Some people even add a layer of cheese on top of the rice paper to create a delicious, aromatic cheesy flavor. Once the rice paper is prepared and the seasonings are added, it is grilled over charcoal or a wood-fired stove. The bánh tráng is grilled until it becomes slightly crispy and develops an attractive golden brown color. The grilling process creates a crispy outer shell and a soft, smooth inner layer, resulting in a delightful combination of ingredients and flavors. With its fantastic taste and simple preparation, bánh tráng nướng has become an important part of Vietnamese cuisine. It is a beloved street food that can be found in various street stalls and is cherished for its unique texture and flavors.",
                "label": "",
                "lstImgs": [
                "https://image.cooky.vn/recipe/g6/55029/s/fa7079ae-224c-4213-8451-87dd351aaa66.jpeg"
                ],
                "coordinates": "10.759477001216624, 106.66930401903862",
                "type": "FOOD",
                "img": "https://image.cooky.vn/recipe/g6/55029/s/fa7079ae-224c-4213-8451-87dd351aaa66.jpeg"
            },
            {
                "id": "95b99f46-1926-4818-9a76-378097e324b3",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Mong Bridge",
                "address": "The area connecting District 1 and District 4, crossing over Ben Nghe Canal.",
                "description": "\r\nThe Mong Bridge is one of the oldest bridges in Saigon, built in the late 19th century. It spans across the Ben Nghe Canal, connecting what are now District 1 and District 4. Currently, the bridge is not open to traffic but serves as a destination for sightseeing and enjoying the scenery. It's an ideal spot for capturing beautiful photographs. Additionally, it's a perfect location for admiring the city at night or experiencing the tradition of sidewalk coffee - a unique characteristic of Saigon.",
                "label": "Mong_Bridge",
                "lstImgs": [
                "https://ik.imagekit.io/tvlk/blog/2024/02/cau-mong-2.jpg",
                " https://static.vinwonders.com/production/cau-mong-banner.jpg",
                " https://3.bp.blogspot.com/-6s1i-HSnpS8/VGIxQ4dXNSI/AAAAAAAACQo/jiRJOkfy7G8/s1600/DSC00150.jpg"
                ],
                "coordinates": "10.7678593,106.7025423",
                "type": "LOCATION",
                "img": "https://ik.imagekit.io/tvlk/blog/2024/02/cau-mong-2.jpg"
            },
            {
                "id": "983233a7-5f71-4d64-acb1-8fee3050f713",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Ho Chi Minh City Museum",
                "address": "65 Ly Tu Trong Street, Ben Nghe Ward, District 1",
                "description": "The Ho Chi Minh City Museum is not only a place that reenacts the history of old Saigon but also an attractive tourist destination for many travelers. This structure, designed by French architect Alfred Foulhoux, was built in 1885 and completed in 1890, covering an area of nearly 2 hectares. The museum is constructed in a neoclassical style with its facade bearing Western architectural influences, while the roof is designed in an Eastern style. It is divided into multiple rooms, each showcasing artifacts according to different themes. With its unique architecture, housed within a century-old building, the Ho Chi Minh City Museum is a fascinating attraction that visitors cannot afford to miss. The museum is open from 8:00 to 17:00.",
                "label": "Ho_Chi_Minh_City_Museum",
                "lstImgs": [
                "https://static.vinwonders.com/production/3uBE1oPI-Ho-Chi-Minh-City-Museum-thumb.jpg",
                " https://hcmc-museum.edu.vn/wp-content/uploads/2021/12/11-1363x800.jpg",
                " https://localvietnam.com/wp-content/uploads/2023/06/ho-chi-minh-city-museum-gia-long-palace-1.jpg"
                ],
                "coordinates": "10.7760763,106.6988953",
                "type": "LOCATION",
                "img": "https://static.vinwonders.com/production/3uBE1oPI-Ho-Chi-Minh-City-Museum-thumb.jpg"
            },
            {
                "id": "998f577a-53ff-47bc-a47e-ac3e9eeebb53",
                "createdAt": "2024-12-20T22:09:19.749Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-22T20:29:25.000Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Bèo",
                "address": "45C Ky Dong Street, Ward 9, District 3",
                "description": "Banh Beo is one of the distinctive dishes of the Central and South Central regions of Vietnam. These small and charming cakes are made from rice flour and water, creating a thin, soft, yet substantial layer. Banh Beo is often garnished with fried shallots and either shrimp or finely diced pork, adding a unique and flavorful touch. Particularly, it is commonly enjoyed with sweet and sour fish sauce, creating a perfect harmony of sweet, salty, and sour flavors that captivates diners. With its petite appearance and delicate taste, Banh Beo is not only a delicious dish but also an icon of Vietnam's rich and diverse cuisine.",
                "label": "banh_beo",
                "lstImgs": [
                "https://saigonnhonews.com/wp-content/uploads/2023/02/trtr.jpg",
                "https://mms.img.susercontent.com/vn-11134513-7r98o-lstsehnar9vo19@resize_ss1242x600!@crop_w1242_h600_cT",
                "",
                "https://firebasestorage.googleapis.com/v0/b/hodos-f29d9.appspot.com/o/images%2Fvn-11134513-7r98o-lstsehnar9vo19%40resize_ss640x400!%40crop_w640_h400_cT.jpeg?alt=media&token=a8bf1add-2d6a-4bf4-85b7-e8cac7003335",
                "",
                ""
                ],
                "coordinates": "10.809287897294798,106.628973431768",
                "type": "FOOD",
                "img": "https://saigonnhonews.com/wp-content/uploads/2023/02/trtr.jpg"
            },
            {
                "id": "9a4f9b46-0e52-4bd8-b762-297aa7ac915a",
                "createdAt": "2024-12-20T22:09:19.895Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:19.895Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Căn",
                "address": "222/6A Bui Dinh Tuy, Ward 12, Binh Thanh District",
                "description": "Banh Can is a type of cake developed in the South Central region of Vietnam. It is mainly made from a special type of rice flour, prepared according to a unique recipe. After soaking the rice in water, it is finely ground along with a bit of dried rice, then poured onto clay molds and grilled directly over charcoal. Afterwards, shrimp, squid, and eggs are added to make the filling. Banh Can is typically served with pickled star fruit, green mango, or cucumber. The dipping sauces for this dish include: a sauce with ground pork, diluted fish sauce with garlic and chili, scallion oil, and braised fish sauce. With these combinations, Banh Can is an experience worth trying when visiting Vietnam.",
                "label": "",
                "lstImgs": [
                "https://dulichkhampha24.com/wp-content/uploads/2022/10/banh-can-da-nang-1.jpg"
                ],
                "coordinates": "10.782083481896064, 106.66432145732885",
                "type": "FOOD",
                "img": "https://dulichkhampha24.com/wp-content/uploads/2022/10/banh-can-da-nang-1.jpg"
            },
            {
                "id": "9edb2dfb-dadf-4499-97e8-2e2626dfd764",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Ba Thien Hau Temple",
                "address": "710 Nguyen Trai Street, District 5",
                "description": "Ba Thien Hau Temple is one of the oldest Chinese temples in Ho Chi Minh City. Built in 1760 by a group of Chinese (Tue Thanh), the temple has stood for 261 years and has undergone numerous renovations while still retaining its unique architectural style. The temple features a distinctive design with three main sections: the Front Hall, the Middle Hall, and the Rear Hall. Additionally, one of its most characteristic features is the unique spiral incense hanging from the ceiling. Visitors to the temple can witness precious artifacts preserved within, participate in festivals, and more. The temple is open from Monday to Sunday, with two visiting sessions: from 6:00 to 11:30 in the morning and from 13:00 to 16:30 in the afternoon.",
                "label": "Ba_Thien_Hau_Temple",
                "lstImgs": [
                "https://ik.imagekit.io/tvlk/blog/2023/07/chua-ba-thien-hau-22.jpg",
                " https://images2.thanhnien.vn/528068263637045248/2024/1/11/img7369-17049574914931963893546.jpg",
                " https://static.vinwonders.com/production/chua-ba-thien-hau-banner-min.jpg"
                ],
                "coordinates": "10.7530763,106.6605223",
                "type": "LOCATION",
                "img": "https://ik.imagekit.io/tvlk/blog/2023/07/chua-ba-thien-hau-22.jpg"
            },
            {
                "id": "a17e8985-581b-410f-b0b7-0b1294dcd814",
                "createdAt": "2024-12-20T22:09:21.263Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.263Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Nem Chua Rán",
                "address": "1 Huỳnh Thúc Kháng, Quận 1, TP. HCM",
                "description": "Nem Chua Rán are crispy, deep-fried rolls filled with a savory mixture of ground pork, fermented pork, and spices. They're a popular street food in Vietnam, often served with a dipping sauce of fish sauce and chili.",
                "label": "",
                "lstImgs": [
                "https://mercifoods.vn/wp-content/uploads/2022/06/nem-chua-ran-3.jpg"
                ],
                "coordinates": "10.773754, 106.703607",
                "type": "FOOD",
                "img": "https://mercifoods.vn/wp-content/uploads/2022/06/nem-chua-ran-3.jpg"
            },
            {
                "id": "aa057644-14fc-4628-980a-39c5ab9d1f2f",
                "createdAt": "2024-12-20T22:09:22.412Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:22.412Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Chè",
                "address": "718 Nguyen Dinh Chieu Street, Ward 1, District 3, Ho Chi Minh City",
                "description": "Chè is a traditional Vietnamese dessert that comes in many varieties, often featuring a combination of sweetened beans, jellies, fruits, and coconut milk. Served hot or cold, it's a versatile and refreshing treat enjoyed for its diverse textures and flavors.",
                "label": "",
                "lstImgs": [
                "https://thamhiemmekong.com/wp-content/uploads/2019/09/che-nguyen-dang-can-tho.jpg"
                ],
                "coordinates": "10.767597, 106.679753",
                "type": "FOOD",
                "img": "https://thamhiemmekong.com/wp-content/uploads/2019/09/che-nguyen-dang-can-tho.jpg"
            },
            {
                "id": "ad0e3505-57a6-40b2-9da3-195c4d6c30bc",
                "createdAt": "2024-12-20T22:09:21.861Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.861Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Gỏi Sứa",
                "address": "32 Bui Huu Nghia Street, Ward 5, District 5, Ho Chi Minh City",
                "description": "Gỏi Sứa is a refreshing Vietnamese salad made with crunchy jellyfish, mixed with fresh herbs, vegetables, and a tangy dressing. It's known for its unique texture and vibrant flavors, making it a popular choice for a light and healthy meal.",
                "label": "",
                "lstImgs": [
                "https://barona.vn/storage/meo-vat/110/cach-lam-goi-sua.jpg"
                ],
                "coordinates": "10.752460, 106.675075",
                "type": "FOOD",
                "img": "https://barona.vn/storage/meo-vat/110/cach-lam-goi-sua.jpg"
            },
            {
                "id": "aeb1b08f-74c0-433b-a804-e79bdd97b18b",
                "createdAt": "2024-12-20T22:09:21.523Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.523Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Tráng Cuốn",
                "address": "62 Tran Nhan Ton Street, Ward 2, District 10, Ho Chi Minh City.",
                "description": "Bánh Tráng Cuốn is a refreshing and versatile snack. Imagine thin, soft rice paper wraps filled with a variety of ingredients like fresh herbs, vegetables, and sometimes meat or seafood. It's often served with a dipping sauce, creating a flavor explosion in every bite.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/Files/2021/07/31/1372102/cach-lam-banh-trang-bo-thom-ngon-cuc-de-lam-202107311752194866.jpg"
                ],
                "coordinates": "10.7625694,106.6748014",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/Files/2021/07/31/1372102/cach-lam-banh-trang-bo-thom-ngon-cuc-de-lam-202107311752194866.jpg"
            },
            {
                "id": "b05819c8-23c5-465f-8f53-e276b2512ead",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Landmark 81",
                "address": "720A Dien Bien Phu Street, Binh Thanh District",
                "description": "\r\nLandmark 81 is the tallest building in Vietnam, boasting a modern and prestigious appearance. Inspired by the bamboo clumps of Vietnam, symbolizing resilience, indomitability, and ceaseless striving, Landmark 81 embodies the prosperity, development, and solidarity of Vietnam. Dubbed as the iconic symbol of Ho Chi Minh City in the new era, Landmark 81 marks a historic milestone in Vietnamese architecture with a total designed height of 461.2 meters, comprising 81 above-ground floors and 3 basement levels. Visiting this landmark, notable attractions not to be missed by tourists include the Landmark 81 Skyview Observatory on the top three floors, the Infinity Pool on the highest floor, the Vincom Ice Rink at B1 basement level, and more.",
                "label": "Landmark_81",
                "lstImgs": [
                "https://www.coteccons.vn/wp-content/uploads/2016/06/shutterstock_1692834160-copy-scaled.jpg",
                " https://anphonggroup.com/wp-content/uploads/2019/07/thelandmark-1-1200x675.jpg",
                " https://hn.ss.bfcplatform.vn/tckt/2022/04/22A04014-1.jpg"
                ],
                "coordinates": "10.7950473,106.7212673",
                "type": "LOCATION",
                "img": "https://www.coteccons.vn/wp-content/uploads/2016/06/shutterstock_1692834160-copy-scaled.jpg"
            },
            {
                "id": "b2259389-dd1d-4f97-85dd-7b40522a2885",
                "createdAt": "2024-12-20T22:09:20.991Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.991Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Chuối Chiên",
                "address": "69/24B Hồ Thị Kỷ, Phường 1, Quận 10",
                "description": "Bánh chuối chiên, also known as \"fried banana fritters,\" is a popular Vietnamese street food. Think of sweet, ripe bananas coated in a crispy batter and deep-fried until golden brown. It's often served with a drizzle of condensed milk, making for a sweet and satisfying snack.",
                "label": "",
                "lstImgs": [
                "https://giadinh.mediacdn.vn/2018/11/20/photo-0-15426808311581827739783.jpg"
                ],
                "coordinates": "10.764788, 106.675919",
                "type": "FOOD",
                "img": "https://giadinh.mediacdn.vn/2018/11/20/photo-0-15426808311581827739783.jpg"
            },
            {
                "id": "bf4e3fe7-813f-432e-a9bc-4b9347990710",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Ho Chi Minh City People's Committee",
                "address": "86 Le Thanh Ton Street, Ben Nghe Ward, District 1",
                "description": "The headquarters of the People's Committee of Ho Chi Minh City is the most unique tourist attraction in the city. It not only reflects the rich history and evidences the development of Vietnam but also embodies values in the fields of painting, architecture, and sculpture. Construction began in 1898 and was officially completed in 1908. The most prominent feature of the building is its Renaissance architecture, Art Nouveau wrought-iron gates (popular at the end of the 19th century), Baroque and Rococo-style bas-reliefs famous from the 16th to the 18th century. Furthermore, the interior design of this building embodies the utmost luxury and elegance of painting and sculpture in the Louis XV era.",
                "label": "Ho_Chi_Minh_City_Peoples_Committee",
                "lstImgs": [
                "https://static.vinwonders.com/production/peoples-committee-building-thumb.jpg",
                " https://www.vietnamonline.com/media/uploads/froala_editor/images/vno_UBHCM2.jpg",
                " https://wallpapers.com/images/hd/ho-chi-minh-city-peoples-committee-go5p7x3w6jsbw10q.jpg"
                ],
                "coordinates": "10.7768252,106.6964241",
                "type": "LOCATION",
                "img": "https://static.vinwonders.com/production/peoples-committee-building-thumb.jpg"
            },
            {
                "id": "c2349200-7fd1-4c5a-b7a7-8722153560af",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Ngoc Hoang Pagoda",
                "address": "73 Mai Thi Luu Street, Da Kao Ward, District 1",
                "description": "\r\nThe Ngoc Hoang Pagoda, also known as the Ngoc Hoang Temple (Phuoc Hai Tu), is a familiar ancient temple to the people of Saigon and tourists alike, with its captivating and unique beauty. Constructed at the beginning of the 20th century in Saigon by a Chinese individual named Luu Minh, the architecture here bears many characteristics of that nation. Unlike the venerable appearance of ancient Chinese architecture, the interiors of the temple have been partially renovated. Alongside preserving the ancient architectural features, the temple's decorations and motifs are vibrant, adding to its allure. Additionally, with its Taoist beliefs in worshipping many deities, Ngoc Hoang Pagoda is a sacred place where one can pray for fertility, love, and peace. The temple is open every day from 7 am to 6 pm.",
                "label": "Ngoc_Hoang_Pagoda",
                "lstImgs": [
                "https://vietnamdiscovery.com/wp-content/uploads/2019/09/Jade-Emperor-Pagoda-Saigon.jpg",
                " https://vntravel.org.vn/uploads/images/2023/10/24/defffc940e41d91f805020-1698137180.jpg",
                " https://www.visithcmc.vn/uploads/0000/6/2023/09/29/dien-ngoc-hoang-jade-emperor-pagoda-geniuslady.jpg"
                ],
                "coordinates": "10.7926242,106.6924301",
                "type": "LOCATION",
                "img": "https://vietnamdiscovery.com/wp-content/uploads/2019/09/Jade-Emperor-Pagoda-Saigon.jpg"
            },
            {
                "id": "c613884e-d941-4844-8a36-9b0dcc45ea3b",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Independence Palace",
                "address": "135 Nam Ky Khoi Nghia Street, Ben Thanh Ward, District 1",
                "description": "Independence Palace is a historical landmark that preserves proud milestones of the Vietnamese nation in the struggle to protect the homeland. Designed by architect Ngô Viết Thụ with the intention of creating a culturally significant structure, Independence Palace embodies Eastern cultural elements throughout its interior, exterior, and landscaping, seamlessly blended with modern design. Specifically, the architecture of the building is modeled after Han-Vietnamese characters with auspicious meanings. With a total area of ​​120,000 square meters, the site is divided into three distinct zones (Fixed Zone, Specialized Zone, Supplementary Zone), each with its own unique characteristics. Independence Palace is open to tourists for visits every day of the week during two time slots: from 7:30 am to 11:30 am in the morning and from 1:00 pm to 5:00 pm in the afternoon.",
                "label": "Independence_Palace",
                "lstImgs": [
                "https://fantasea.vn/wp-content/uploads/2018/10/dinh-%C4%91%E1%BB%99c-l%E1%BA%ADp-s%C3%A0i-g%C3%B2n.jpg",
                " https://ik.imagekit.io/tvlk/blog/2023/01/dinh-doc-lap-1.jpg",
                " https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/20190923_Independence_Palace-10.jpg/1200px-20190923_Independence_Palace-10.jpg"
                ],
                "coordinates": "10.7765164,106.6957253",
                "type": "LOCATION",
                "img": "https://fantasea.vn/wp-content/uploads/2018/10/dinh-%C4%91%E1%BB%99c-l%E1%BA%ADp-s%C3%A0i-g%C3%B2n.jpg"
            },
            {
                "id": "c93e4d1a-ef6e-4575-b744-fa1ea4443297",
                "createdAt": "2024-12-20T22:09:20.387Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.387Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bún Mắm",
                "address": "N44 Hoang Dieu Street, Ward 6, District 4",
                "description": null,
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2021/09/CookRecipe/Avatar/bun-mam-thumbnail.jpg"
                ],
                "coordinates": "10.739349638649403, 106.71842805927787",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2021/09/CookRecipe/Avatar/bun-mam-thumbnail.jpg"
            },
            {
                "id": "d22c4d47-2a62-42cd-8f5e-9e775b204a26",
                "createdAt": "2024-12-20T22:09:22.478Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:22.478Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Thịt Xiên Nướng",
                "address": "135 Bui Vien Street, District 1, Ho Chi Minh City",
                "description": "Thịt Xiên Nướng is a popular Vietnamese dish consisting of marinated pork skewers grilled to perfection. The pork is typically seasoned with a blend of lemongrass, garlic, sugar, and fish sauce, giving it a savory and slightly sweet flavor. Often served with fresh herbs, rice noodles, or a side of dipping sauce, these skewers are a favorite street food, known for their aromatic and delicious taste.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2022/01/CookDish/2-cach-lam-thit-xien-nuong-cuc-ngon-voi-avt-1200x676.jpg"
                ],
                "coordinates": "10.766504, 106.691912",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2022/01/CookDish/2-cach-lam-thit-xien-nuong-cuc-ngon-voi-avt-1200x676.jpg"
            },
            {
                "id": "d2f9317c-7392-4dfa-a231-af915459d2a3",
                "createdAt": "2024-12-20T22:09:21.588Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.588Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Xoài Lắc",
                "address": "5 Tôn Thất Thiệp Street, Bến Nghé Ward, District 1, Ho Chi Minh City.",
                "description": "Xoài Lắc is a popular Vietnamese snack made from fresh mangoes that are shaken with a mix of chili, sugar, salt, and sometimes shrimp powder. This combination creates a delightful balance of sweet, spicy, and tangy flavors, making it a refreshing and addictive treat. It's a favorite street food, especially enjoyed during hot weather.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/Files/2017/06/03/988767/cach-lam-xoai-lac-an-la-ghien-tai-nha-202202251022325871.jpg"
                ],
                "coordinates": "10.773546, 106.702681",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/Files/2017/06/03/988767/cach-lam-xoai-lac-an-la-ghien-tai-nha-202202251022325871.jpg"
            },
            {
                "id": "d3396a6e-a958-495f-ba45-d4f23a5d0d4a",
                "createdAt": "2024-12-20T22:09:22.125Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:22.125Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Sữa Chua",
                "address": "996 Truong Sa Street, Ward 12, District 3, Ho Chi Minh City",
                "description": "Sữa Chua is Vietnamese yogurt, known for its creamy texture and tangy flavor. Often enjoyed as a refreshing dessert or snack, it can be served plain or with toppings like fruit, jelly, or sweetened condensed milk. It's a popular choice for a light and healthy treat.",
                "label": "",
                "lstImgs": [
                "https://cafefcdn.com/zoom/700_438/203337114487263232/2021/12/25/photo1640418070063-1640418070230276057642.jpeg"
                ],
                "coordinates": "10.787129, 106.674238",
                "type": "FOOD",
                "img": "https://cafefcdn.com/zoom/700_438/203337114487263232/2021/12/25/photo1640418070063-1640418070230276057642.jpeg"
            },
            {
                "id": "d5b4012d-de7a-440c-9e2a-fc982aa1fd18",
                "createdAt": "2024-12-20T22:09:19.688Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:19.688Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Xèo",
                "address": "164 Nguyen Thi Nho Street, District 11",
                "description": "Banh Xeo is a traditional and popular dish in Vietnamese cuisine. The preparation process starts by making a batter from rice, and coconut milk thencreating a smooth and slightly thick mixture. Other ingredients such as green onions, pork, shrimp, mung beans, and seasonings like scallion oil, and fish sauce are added to create the distinctive flavor. Once cooked, Banh Xeo has a thin, crispy, golden-yellow crust. To enjoy Banh Xeo, it is typically removed from the pan and wrapped in fresh rice paper along with various herbs like basil and lettuce. It is often served with condiments such as sweetened fish sauce. Banh Xeo provides a delightful combination of flavors and a diverse culinary experience. The crispy texture of the crust, combined with the savory and aromatic fillings, creates a wonderful balance of tastes. Banh Xeo can be enjoyed as a main dish or as a snack, and it is an essential part of Vietnamese street food.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2020/12/CookProduct/11-1200x676.jpg"
                ],
                "coordinates": "10.762642491049318, 106.70667593109812",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2020/12/CookProduct/11-1200x676.jpg"
            },
            {
                "id": "da7cedd6-0f5b-42d7-a685-679972f4bf44",
                "createdAt": "2024-12-20T22:09:21.455Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.455Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Flan",
                "address": "14 Trần Bình Trọng, phường 1, quận 5, TP HCM",
                "description": "A classic dessert, Bánh Flan is a smooth and creamy custard made with eggs, milk, and sugar. It's often topped with a layer of caramel sauce, adding a touch of sweetness and a delightful contrast in texture.",
                "label": "",
                "lstImgs": [
                "https://daotaobeptruong.vn/wp-content/uploads/2022/04/banh-flan-beo-ngay.jpg"
                ],
                "coordinates": "10.752849, 106.682298",
                "type": "FOOD",
                "img": "https://daotaobeptruong.vn/wp-content/uploads/2022/04/banh-flan-beo-ngay.jpg"
            },
            {
                "id": "df872bb6-87cd-466d-89cd-e9a13c08e1f3",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Phap Hoa Pagoda",
                "address": "870 Truong Sa Street, Ward 14, District 3",
                "description": "Phap Hoa Pagoda is a renowned spiritual destination in Ho Chi Minh City. Established in 1928 by Venerable Dao Ha Thanh, this nearly 100-year-old pagoda captivates visitors primarily with its unique architecture. Standing on Le Van Sy Bridge, one can behold the majestic pagoda, steadfastly situated beside the picturesque Nhieu Loc Canal. Additionally, the Buddha's Birthday celebration at the pagoda is a prominent event that attracts many tourists both domestically and internationally. This celebration takes place annually in the fourth month of the lunar calendar. On this day, the pagoda is adorned with numerous lanterns, hanging both inside the temple and along the Nhieu Loc Canal. In the evening, the scene becomes enchanting and magical with the dazzling lights. The pagoda is open daily from 6:00 to 11:30 in the morning and from 13:30 to 21:00 in the evening.",
                "label": "Phap_Hoa_Pagoda",
                "lstImgs": [
                "https://statics.vinpearl.com/chua-phap-hoa-2_1630420134.jpg",
                " https://ik.imagekit.io/tvlk/blog/2024/03/chua-phap-hoa-3.jpg",
                " https://cdn.alongwalk.info/vn/wp-content/uploads/2023/08/14234909/23-ngoi-chua-sai-gon-linh-thieng-noi-tieng1692006549.jpg"
                ],
                "coordinates": "10.7864033,106.6805613",
                "type": "LOCATION",
                "img": "https://statics.vinpearl.com/chua-phap-hoa-2_1630420134.jpg"
            },
            {
                "id": "e1acf8f1-7631-4746-b65a-fcd0fffed768",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-22T00:15:53.000Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Municipal Theatre of Ho Chi Minh City",
                "address": "7 Lam Son Square, Ben Nghe Ward, District 1",
                "description": "In 1897, architect Eugène Ferret constructed the Ho Chi Minh City Opera House. With a total area of 2016m² and featuring \"New Classical\" style, the Opera House embodies the beauty derived from the fusion of ancient Greek-Roman architectural aesthetics and the romantic, refined strokes of French art. The City Opera House serves as a stage for various performances including opera, chamber music concerts, various forms of dance, musicals, and more. The Opera House is open from Monday to Friday, from 9:00 to 16:30, and on weekends from 9:00 to 12:00.",
                "label": "Municipal_Theatre_of_Ho_Chi_Minh_City",
                "lstImgs": [
                "https://upload.wikimedia.org/wikipedia/commons/6/6b/Saigon_Opera_House_2014.jpg",
                " https://media.urbanistnetwork.com/saigoneer/article-images/legacy/XW5oleFb.jpg",
                " https://paris1972.files.wordpress.com/2022/06/hcmc-theater-opera-front-arriv-mar16.jpg",
                "",
                "",
                ""
                ],
                "coordinates": "10.7768163,106.7024543",
                "type": "LOCATION",
                "img": "https://upload.wikimedia.org/wikipedia/commons/6/6b/Saigon_Opera_House_2014.jpg"
            },
            {
                "id": "e2763fc0-30fd-4262-bade-4f8dbff64853",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Binh Tay Market",
                "address": "57A Thap Muoi Street, Ward 2, District 6",
                "description": "Binh Tay Market is a wholesale market that offers a wide range of high-quality goods with diverse designs. Moreover, it is known as the oldest Chinese market in Ho Chi Minh City. The market covers an area of up to 25,000 square meters with 13 gates and is designed in a distinctive Eastern architectural style. It features a total of 2,300 stalls selling over 30 different types of goods, organized into 5 distinct sections. This market operates from early morning until late at night. Particularly, if you want to explore the diversity of Saigon's cuisine, you should visit in the evening or late at night.",
                "label": "Binh_Tay_Market",
                "lstImgs": [
                "https://static.vinwonders.com/production/cho-binh-tay-2.jpg",
                " https://static.vinwonders.com/production/cho-binh-tay-5.jpg",
                " https://image.vietgoing.com/destination/vietgoing_kuv2106048052.webp"
                ],
                "coordinates": "10.7498953,106.6496923",
                "type": "LOCATION",
                "img": "https://static.vinwonders.com/production/cho-binh-tay-2.jpg"
            },
            {
                "id": "e86d09b8-22ec-4762-96ab-aa652c630e62",
                "createdAt": "2024-12-20T22:09:20.927Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.927Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Gối",
                "address": "6 Hong Ha Street, Ward 2, Tan Binh District, Ho Chi Minh City",
                "description": "Bánh Gối are crispy fried dumplings filled with savory ingredients like mung beans or ground pork. They're a delicious and popular street food in Vietnam, often served with a spicy dipping sauce.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/2023/04/CookDish/cach-lam-banh-goi-nhan-thit-don-gian-ma-ngon-ngat-ngay-avt-1200x676.jpg"
                ],
                "coordinates": "10.8138556,106.6701042",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/2023/04/CookDish/cach-lam-banh-goi-nhan-thit-don-gian-ma-ngon-ngat-ngay-avt-1200x676.jpg"
            },
            {
                "id": "e9abb6bb-83fd-400e-a0c5-63ce33b54db2",
                "createdAt": "2024-12-20T22:09:19.399Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:19.399Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Mì",
                "address": "19 Huynh Khuong Ninh Street, Da Kao Ward, District 1",
                "description": "Vietnamese Banh Mi is a distinctive and globally renowned dish. It is known for its perfect combination of crispy toasted bread and diverse fillings. Common fillings include grilled pork, barbecued pork (xa xiu), or grilled chicken. The meat is cooked or grilled with various spices to create a rich flavor. In addition to meat, Banh Mi can also include ingredients such as pate, sausages, fried eggs, or vegetarian options with vegetables. It is served with sauces such as mayonnaise, chili sauce, or soy sauce. Banh Mi is considered a quick, convenient, and popular street food in Vietnam. It can be found in sandwich shops, eateries, and even street food carts. With its balanced and diverse flavors, Vietnamese Banh Mi is a fascinating and unique dish loved worldwide.",
                "label": "",
                "lstImgs": [
                "https://hips.hearstapps.com/hmg-prod/images/banh-mi-with-grilled-pork1-1663331872.jpg"
                ],
                "coordinates": "10.790397508610395, 106.69669912626448",
                "type": "FOOD",
                "img": "https://hips.hearstapps.com/hmg-prod/images/banh-mi-with-grilled-pork1-1663331872.jpg"
            },
            {
                "id": "eadc7e37-28ba-4b84-a25a-97e7407aef33",
                "createdAt": "2024-12-20T22:09:20.033Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:20.033Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bún Thịt Nướng",
                "address": "1657 Pham The Hien Street, Ward 6, District 8",
                "description": "Bun Thit Nuong is a beloved and popular specialty dish in all three regions of Vietnam. This dish consists of soft vermicelli noodles, combined with grilled meat, pickled vegetables, and various vegetables such as lettuce, cucumber, cilantro, and mint. The grilled meat is typically prepared from seasoned pork and grilled over charcoal or wood, creating a delicious and flavorful aroma. Bun Thit Nuong is often served with sweet and sour fish sauce, finely chopped peanuts, and fresh chili, creating a rich and enjoyable culinary experience. With its distinctive flavor and rich combination, Bun Thit Nuong is one of the favorite dishes commonly found on the dining tables of every Vietnamese household and restaurant.",
                "label": "",
                "lstImgs": [
                "https://www.hoangbeo.com/wp-content/uploads/z4712117611734_6f7e121bf37455de15e9d739e6a6d4ff.jpg"
                ],
                "coordinates": "10.785189046631066, 106.66249456740614",
                "type": "FOOD",
                "img": "https://www.hoangbeo.com/wp-content/uploads/z4712117611734_6f7e121bf37455de15e9d739e6a6d4ff.jpg"
            },
            {
                "id": "efd05a06-53a3-4eee-a1a2-d06cd4f416f1",
                "createdAt": "2024-12-20T22:09:21.928Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.928Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Kem",
                "address": "260 Le Hong Phong Street, Ward 4, District 5, Ho Chi Minh City",
                "description": "Kem is the Vietnamese word for ice cream, a popular dessert enjoyed for its creamy texture and refreshing taste. Available in a variety of flavors, from traditional vanilla and chocolate to local favorites like coconut and durian, kem is a delightful treat for cooling down in the tropical heat.",
                "label": "",
                "lstImgs": [
                "https://cdn.tgdd.vn/Files/2020/03/25/1244397/cach-lam-kem-dua-thom-ngon-tai-nha-bang-may-xay-sinh-to-202003250909366047.jpg"
                ],
                "coordinates": "10.761499, 106.676861",
                "type": "FOOD",
                "img": "https://cdn.tgdd.vn/Files/2020/03/25/1244397/cach-lam-kem-dua-thom-ngon-tai-nha-bang-may-xay-sinh-to-202003250909366047.jpg"
            },
            {
                "id": "f17b242b-473b-4603-8734-8ce3c8327215",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Ho Chi Minh City Post Office",
                "address": "02 Cong xa Paris Street, Ben Nghe Ward, District 1",
                "description": "The Sai Gon Central Post Office is a must-visit attraction in Ho Chi Minh City. Construction of the city's Central Post Office began in 1886 and was completed in 1891 under the skillful direction of the renowned French architect Gustave Eiffel. Visitors can admire the grand interior with its high ceilings, intricate details, and beautiful mosaic floors. The post office still functions as a working post office, making it a unique experience to send postcards or letters from this historic site. The Sai Gon Central Post Office is open from 7 am to 9 pm, every day of the week.",
                "label": "Ho_Chi_Minh_City_Post_Office",
                "lstImgs": [
                "https://www.visithcmc.vn/uploads/0000/6/2021/08/23/rsz-buu-dien-299704961.jpg",
                " https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2023/5/31/1198921/Z4391546745341_743Be.jpg",
                " https://ik.imagekit.io/tvlk/blog/2023/04/buu-dien-thanh-pho-2.jpg"
                ],
                "coordinates": "10.7799386,106.6988694",
                "type": "LOCATION",
                "img": "https://www.visithcmc.vn/uploads/0000/6/2021/08/23/rsz-buu-dien-299704961.jpg"
            },
            {
                "id": "fed2bd5d-f63c-4f43-8429-97dd873cd97d",
                "createdAt": "2024-12-21T23:54:44.982Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-21T23:54:44.982Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Thu Ngu Flagpole",
                "address": "2 Ton Duc Thang Street, Nguyen Thai Binh Ward, District 1",
                "description": "\r\nThe Thu Ngu Flagpole stands on a piece of land at the confluence of the Saigon River and the Ben Nghe Canal. Built around the first half of the 19th century, the Thu Ngu Flagpole has been standing for over 150 years. Initially constructed for the purpose of observing ship traffic on the Saigon River, it no longer serves its original function today. Instead, the Thu Ngu Flagpole has become a scenic spot for sightseeing and exploration, offering visitors the opportunity to delve into the origins and historical development of the city.\r\n",
                "label": "Thu_Ngu_Flagpole",
                "lstImgs": [
                "https://kyluc.vn/Userfiles/Upload/images/dsc_3781.jpg",
                " https://tapchidongnama.vn/wp-content/uploads/2023/08/z4573621852016-53d99c6a150f3e97bc30eb37783e0950-551.jpg",
                " https://image.tienphong.vn/w1000/Uploaded/2024/dbyxqdrsxr/2023_07_22/thu-ngu-nhin-ngang-2511.jpg"
                ],
                "coordinates": "10.7699173,106.7056183",
                "type": "LOCATION",
                "img": "https://kyluc.vn/Userfiles/Upload/images/dsc_3781.jpg"
            },
            {
                "id": "ff619bd0-886c-43ed-a759-0fab19af97d0",
                "createdAt": "2024-12-20T22:09:21.056Z",
                "createdBy": null,
                "createdByName": null,
                "updatedAt": "2024-12-20T22:09:21.056Z",
                "updatedBy": null,
                "deleteBy": null,
                "isDeleted": false,
                "name": "Bánh Tiêu",
                "address": "23 Rạch Bùng Binh, Quận 3, TP. HCM",
                "description": "Bánh Tiêu are small, savory, and slightly sweet Vietnamese pastries. Imagine a crispy, golden brown dough studded with sesame seeds and filled with a soft, chewy center. They're often enjoyed as a snack or with a cup of tea or coffee.",
                "label": "",
                "lstImgs": [
                "https://img.tripi.vn/cdn-cgi/image/width=700",
                "height=700/https://gcs.tripi.vn/public-tripi/tripi-feed/img/473806HjL/banh-tieu-chua-ong-1263885.jpg"
                ],
                "coordinates": "10.780207, 106.679344",
                "type": "FOOD",
                "img": "https://img.tripi.vn/cdn-cgi/image/width=700"
            }
            ]
        """.trimIndent()
            val listType = object : TypeToken<List<Location>>() {}.type
            val locations: List<Location> = Gson().fromJson(jsonString, listType)
            return LstLocation(locations)
        }
    }
}
