package com.github.catvod.spider.merge.p016Q;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.Q.f */
/* loaded from: classes.dex */
public class C0184f<K, V> implements Map<K, V> {

    /* renamed from: a */
    protected final AbstractC0179a f335a;

    /* renamed from: c */
    protected int f337c = 0;

    /* renamed from: d */
    protected int f338d = 12;

    /* renamed from: b */
    protected LinkedList<C0183e<K, V>>[] f336b = new LinkedList[8];

    public C0184f(AbstractC0179a abstractC0179a) {
        this.f335a = abstractC0179a;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f336b = new LinkedList[16];
        this.f337c = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int mo1191F = this.f335a.mo1191F(obj);
        LinkedList<C0183e<K, V>>[] linkedListArr = this.f336b;
        LinkedList<C0183e<K, V>> linkedList = linkedListArr[mo1191F & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        Iterator<C0183e<K, V>> it = linkedList.iterator();
        while (it.hasNext()) {
            C0183e<K, V> next = it.next();
            if (this.f335a.mo1192E(next.f333a, obj)) {
                return next.f334b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        LinkedList<C0183e<K, V>>[] linkedListArr;
        C0183e<K, V> next;
        int i = 0;
        for (LinkedList<C0183e<K, V>> linkedList : this.f336b) {
            if (linkedList != null) {
                Iterator<C0183e<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    i = C0052e.m1411h(i, this.f335a.mo1191F(next.f333a));
                }
            }
        }
        return C0052e.m1415d(i, this.f337c);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f337c == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        C0183e<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.f337c > this.f338d) {
            LinkedList<C0183e<K, V>>[] linkedListArr = this.f336b;
            int length = linkedListArr.length * 2;
            this.f336b = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f338d = (int) (d * 0.75d);
            int i = this.f337c;
            for (LinkedList<C0183e<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<C0183e<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.f333a, next.f334b);
                    }
                }
            }
            this.f337c = i;
        }
        int mo1191F = this.f335a.mo1191F(k);
        LinkedList<C0183e<K, V>>[] linkedListArr2 = this.f336b;
        int length2 = mo1191F & (linkedListArr2.length - 1);
        LinkedList<C0183e<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        Iterator<C0183e<K, V>> it2 = linkedList2.iterator();
        while (it2.hasNext()) {
            C0183e<K, V> next2 = it2.next();
            if (this.f335a.mo1192E(next2.f333a, k)) {
                V v2 = next2.f334b;
                next2.f334b = v;
                this.f337c++;
                return v2;
            }
        }
        linkedList2.add(new C0183e<>(k, v));
        this.f337c++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f337c;
    }

    public final String toString() {
        LinkedList<C0183e<K, V>>[] linkedListArr;
        C0183e<K, V> next;
        if (this.f337c == 0) {
            return atm.m897d("1107");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<C0183e<K, V>> linkedList : this.f336b) {
            if (linkedList != null) {
                Iterator<C0183e<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(atm.m897d("465A"));
                    }
                    sb.append(next.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        LinkedList<C0183e<K, V>>[] linkedListArr;
        ArrayList arrayList = new ArrayList(this.f337c);
        for (LinkedList<C0183e<K, V>> linkedList : this.f336b) {
            if (linkedList != null) {
                Iterator<C0183e<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f334b);
                }
            }
        }
        return arrayList;
    }
}
