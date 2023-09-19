package com.github.catvod.spider.merge.p018S;

import com.github.catvod.spider.merge.atm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.S.b */
/* loaded from: classes.dex */
public final class C0201b {

    /* renamed from: a */
    private static final Map<String, Class<?>> f351a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f352b;

    /* renamed from: c */
    private static final Map<Class<?>, Class<?>> f353c;

    /* renamed from: d */
    private static final Map<String, String> f354d;

    /* renamed from: e */
    public static final /* synthetic */ int f355e = 0;

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map<java.lang.Class<?>, java.lang.Class<?>>, java.util.HashMap] */
    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap hashMap = new HashMap();
        f351a = hashMap;
        Class cls = Boolean.TYPE;
        String m897d = atm.m897d("08151519293904");
        hashMap.put(m897d, cls);
        Class cls2 = Byte.TYPE;
        String m897d2 = atm.m897d("08030E10");
        hashMap.put(m897d2, cls2);
        Class cls3 = Character.TYPE;
        String m897d3 = atm.m897d("09121B07");
        hashMap.put(m897d3, cls3);
        Class cls4 = Short.TYPE;
        String m897d4 = atm.m897d("1912150738");
        hashMap.put(m897d4, cls4);
        Class cls5 = Integer.TYPE;
        String m897d5 = atm.m897d("03140E");
        hashMap.put(m897d5, cls5);
        Class cls6 = Long.TYPE;
        String m897d6 = atm.m897d("06151412");
        hashMap.put(m897d6, cls6);
        Class cls7 = Double.TYPE;
        String m897d7 = atm.m897d("0E150F17203D");
        hashMap.put(m897d7, cls7);
        Class cls8 = Float.TYPE;
        String m897d8 = atm.m897d("0C16151438");
        hashMap.put(m897d8, cls8);
        hashMap.put(atm.m897d("1C151311"), Void.TYPE);
        HashMap hashMap2 = new HashMap();
        f352b = hashMap2;
        hashMap2.put(cls, Boolean.class);
        hashMap2.put(Byte.TYPE, Byte.class);
        hashMap2.put(Character.TYPE, Character.class);
        hashMap2.put(Short.TYPE, Short.class);
        hashMap2.put(cls5, Integer.class);
        hashMap2.put(cls6, Long.class);
        hashMap2.put(Double.TYPE, Double.class);
        hashMap2.put(cls8, Float.class);
        Class cls9 = Void.TYPE;
        hashMap2.put(cls9, cls9);
        f353c = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class cls10 = (Class) entry.getKey();
            Class cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                f353c.put(cls11, cls10);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put(m897d5, atm.m897d("23"));
        hashMap3.put(m897d, atm.m897d("30"));
        hashMap3.put(m897d8, atm.m897d("2C"));
        hashMap3.put(m897d6, atm.m897d("20"));
        hashMap3.put(m897d4, atm.m897d("39"));
        hashMap3.put(m897d2, atm.m897d("28"));
        hashMap3.put(m897d7, atm.m897d("2E"));
        hashMap3.put(m897d3, atm.m897d("29"));
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            hashMap4.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(hashMap3);
        f354d = Collections.unmodifiableMap(hashMap4);
    }

    /* renamed from: a */
    public static String m1178a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (C0207h.m1172c(name)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (name.startsWith(atm.m897d("31"))) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb.append(atm.m897d("3127"));
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            Map<String, String> map = f354d;
            if (map.containsKey(name)) {
                name = map.get(name);
            }
        }
        int lastIndexOf = name.lastIndexOf(46);
        int indexOf = name.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = name.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }
}
