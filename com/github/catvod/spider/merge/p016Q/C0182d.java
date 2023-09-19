package com.github.catvod.spider.merge.p016Q;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.Q.d */
/* loaded from: classes.dex */
public final class C0182d<Key1, Key2, Value> {

    /* renamed from: a */
    Map<Key1, Map<Key2, Value>> f332a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<Key1, java.util.Map<Key2, Value>>] */
    /* renamed from: a */
    public final Value m1215a(Key1 key1, Key2 key2) {
        Map map = (Map) this.f332a.get(key1);
        if (map == null) {
            return null;
        }
        return (Value) map.get(key2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<Key1, java.util.Map<Key2, Value>>] */
    /* renamed from: b */
    public final Value m1214b(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> map = (Map) this.f332a.get(key1);
        if (map == null) {
            map = new LinkedHashMap<>();
            this.f332a.put(key1, map);
            value2 = null;
        } else {
            value2 = map.get(key2);
        }
        map.put(key2, value);
        return value2;
    }
}
