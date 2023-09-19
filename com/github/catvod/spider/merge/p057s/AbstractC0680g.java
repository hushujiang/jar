package com.github.catvod.spider.merge.p057s;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0665m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.s.g */
/* loaded from: classes.dex */
public abstract class AbstractC0680g<E> extends AbstractC0676c<E> implements Set<E> {

    /* renamed from: b */
    private transient AbstractC0679f<E> f1286b;

    /* renamed from: g */
    static int m107g(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            C0665m.m129c(max < 1073741824, atm.m897d("09151619293B1E13151B6C2C05155A192D2A0D1F"));
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (true) {
            double d = highestOneBit;
            Double.isNaN(d);
            if (d * 0.7d >= max) {
                return highestOneBit;
            }
            highestOneBit <<= 1;
        }
    }

    /* renamed from: h */
    private static <E> AbstractC0680g<E> m106h(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new C0685l(obj);
            }
            int m107g = m107g(i);
            Object[] objArr2 = new Object[m107g];
            int i2 = m107g - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr[i5];
                C0682i.m104a(obj2, i5);
                int hashCode = obj2.hashCode();
                int m112a = C0675b.m112a(hashCode);
                while (true) {
                    int i6 = m112a & i2;
                    Object obj3 = objArr2[i6];
                    if (obj3 == null) {
                        objArr[i4] = obj2;
                        objArr2[i6] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj3.equals(obj2)) {
                        break;
                    } else {
                        m112a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new C0685l(obj4);
            } else if (m107g(i4) < m107g / 2) {
                return m106h(i4, objArr);
            } else {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C0684k(objArr, i3, objArr2, i2, i4);
            }
        }
        return C0684k.f1293i;
    }

    /* renamed from: j */
    public static AbstractC0680g m105j() {
        return m106h(4, atm.m897d("0808"), atm.m897d("0E1F1C192D2C0F"), atm.m897d("0D001305"), atm.m897d("12571D0F2528"));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0680g) && (this instanceof C0684k)) {
            AbstractC0680g abstractC0680g = (AbstractC0680g) obj;
            abstractC0680g.getClass();
            if ((abstractC0680g instanceof C0684k) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public final AbstractC0679f<E> m108f() {
        AbstractC0679f<E> abstractC0679f = this.f1286b;
        if (abstractC0679f == null) {
            AbstractC0679f<E> mo100i = mo100i();
            this.f1286b = mo100i;
            return mo100i;
        }
        return abstractC0679f;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
        return i;
    }

    /* renamed from: i */
    AbstractC0679f<E> mo100i() {
        Object[] array = toArray();
        int i = AbstractC0679f.f1285c;
        int length = array.length;
        if (length == 0) {
            return (AbstractC0679f<E>) C0683j.f1289f;
        }
        return new C0683j(array, length);
    }
}
