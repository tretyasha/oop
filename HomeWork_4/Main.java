package HomeWork_4;

import HomeWork_4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gblist = new GBLinkedList<>();
        gblist.add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(1,6); // РґРѕР±Р°РІР»СЏРµРј СЌР»РµРјРµРЅС‚ РїРѕ РёРЅРґРµРєСЃСѓ // 
        System.out.println(gblist);
        
        gblist.addFirst(1); // РґРѕР±Р°РІР»РµРЅРёРµ РІ РЅР°С‡Р°Р»Рѕ СЃРїРёСЃРєР°
        gblist.addLast(6); // РґРѕР±Р°РІР»РµРЅРёРµ РІ РєРѕРЅРµС† СЃРїРёСЃРєР°
        System.out.println(gblist);

        gblist.remove(2); // СѓРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· СЃРїРёСЃРєР° РїРѕ РёРЅРґРµРєСЃСѓ
        System.out.println(gblist);

        gblist.removeFirst(); // СѓРґР°Р»РµРЅРёРµ РїРµСЂРІРѕРіРѕ СЌР»РµРјРµРЅС‚Р° СЃРїРёСЃРєР°
        System.out.println(gblist);

        gblist.removeLast(); // СѓРґР°Р»РµРЅРёРµ РїРѕСЃР»РµРґРЅРµРіРѕ СЌР»РµРјРµРЅС‚Р° СЃРїРёСЃРєР°
        System.out.println(gblist);

        gblist.update(1, 10); // Р·Р°РјРµРЅР° СЌР»РµРјРµРЅС‚Р° СЃРїРёСЃРєР° РїРѕ РёРЅРґРµРєСЃСѓ
        System.out.println(gblist);
        
        System.out.println("Р Р°Р·РјРµСЂ СЃРїРёСЃРєР°: " + gblist.size());
        System.out.println("Р­Р»РµРјРµРЅС‚ СЃ РёРЅРґРµРєСЃРѕРј 0: " + gblist.get(0));
    }
}

