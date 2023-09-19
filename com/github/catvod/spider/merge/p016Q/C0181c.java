package com.github.catvod.spider.merge.p016Q;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.Q.c */
/* loaded from: classes.dex */
public class C0181c<T> implements Set<T> {

    /* renamed from: a */
    protected final AbstractC0179a f327a;

    /* renamed from: b */
    protected T[][] f328b;

    /* renamed from: c */
    protected int f329c;

    /* renamed from: d */
    protected int f330d;

    /* renamed from: e */
    protected int f331e;

    public C0181c() {
        this(null, 8);
    }

    public C0181c(AbstractC0179a abstractC0179a, int i) {
        this.f329c = 0;
        this.f330d = (int) Math.floor(12.0d);
        this.f331e = 8;
        this.f327a = abstractC0179a == null ? C0190l.f347a : abstractC0179a;
        this.f328b = mo1219d(16);
        this.f331e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    protected T mo1222a(Object obj) {
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        return m1217f(t) == t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (m1217f(t) != t) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean m1221b(T t) {
        if (t == null) {
            return false;
        }
        T[] tArr = this.f328b[m1218e(t)];
        T t2 = null;
        if (tArr != null) {
            int length = tArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t3 = tArr[i];
                    if (t3 == null) {
                        break;
                    } else if (this.f327a.mo1192E(t3, t)) {
                        t2 = t3;
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        return t2 != null;
    }

    /* renamed from: c */
    protected T[] mo1220c(int i) {
        return (T[]) new Object[i];
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f328b = mo1219d(16);
        this.f329c = 0;
        this.f330d = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m1221b(mo1222a(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection<?> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.github.catvod.spider.merge.p016Q.C0181c
            r1 = 0
            if (r0 == 0) goto L2c
            com.github.catvod.spider.merge.Q.c r8 = (com.github.catvod.spider.merge.p016Q.C0181c) r8
            T[][] r8 = r8.f328b
            int r0 = r8.length
            r2 = 0
        Lb:
            if (r2 >= r0) goto L45
            r3 = r8[r2]
            if (r3 != 0) goto L12
            goto L29
        L12:
            int r4 = r3.length
            r5 = 0
        L14:
            if (r5 >= r4) goto L29
            r6 = r3[r5]
            if (r6 != 0) goto L1b
            goto L29
        L1b:
            java.lang.Object r6 = r7.mo1222a(r6)
            boolean r6 = r7.m1221b(r6)
            if (r6 != 0) goto L26
            return r1
        L26:
            int r5 = r5 + 1
            goto L14
        L29:
            int r2 = r2 + 1
            goto Lb
        L2c:
            java.util.Iterator r8 = r8.iterator()
        L30:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r8.next()
            java.lang.Object r0 = r7.mo1222a(r0)
            boolean r0 = r7.m1221b(r0)
            if (r0 != 0) goto L30
            return r1
        L45:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p016Q.C0181c.containsAll(java.util.Collection):boolean");
    }

    /* renamed from: d */
    protected T[][] mo1219d(int i) {
        return (T[][]) new Object[i];
    }

    /* renamed from: e */
    protected final int m1218e(T t) {
        return this.f327a.mo1191F(t) & (this.f328b.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0181c) {
            C0181c c0181c = (C0181c) obj;
            if (c0181c.f329c != this.f329c) {
                return false;
            }
            return containsAll(c0181c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final T m1217f(T t) {
        T[] tArr;
        int i = 0;
        if (this.f329c > this.f330d) {
            T[][] tArr2 = this.f328b;
            int length = tArr2.length * 2;
            T[][] mo1219d = mo1219d(length);
            int[] iArr = new int[mo1219d.length];
            this.f328b = mo1219d;
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f330d = (int) (d * 0.75d);
            for (T[] tArr3 : tArr2) {
                if (tArr3 != null) {
                    for (T t2 : tArr3) {
                        if (t2 == null) {
                            break;
                        }
                        int m1218e = m1218e(t2);
                        int i2 = iArr[m1218e];
                        if (i2 == 0) {
                            tArr = mo1220c(this.f331e);
                            mo1219d[m1218e] = tArr;
                        } else {
                            tArr = mo1219d[m1218e];
                            if (i2 == tArr.length) {
                                tArr = (T[]) Arrays.copyOf(tArr, tArr.length * 2);
                                mo1219d[m1218e] = tArr;
                            }
                        }
                        tArr[i2] = t2;
                        iArr[m1218e] = iArr[m1218e] + 1;
                    }
                }
            }
        }
        int m1218e2 = m1218e(t);
        T[] tArr4 = this.f328b[m1218e2];
        if (tArr4 != null) {
            while (true) {
                if (i >= tArr4.length) {
                    int length2 = tArr4.length;
                    Object[] copyOf = Arrays.copyOf(tArr4, tArr4.length * 2);
                    this.f328b[m1218e2] = copyOf;
                    copyOf[length2] = t;
                    break;
                }
                T t3 = tArr4[i];
                if (t3 == null) {
                    tArr4[i] = t;
                    break;
                } else if (this.f327a.mo1192E(t3, t)) {
                    return t3;
                } else {
                    i++;
                }
            }
        } else {
            T[] mo1220c = mo1220c(this.f331e);
            mo1220c[0] = t;
            this.f328b[m1218e2] = mo1220c;
        }
        this.f329c++;
        return t;
    }

    /* renamed from: g */
    public final boolean m1216g(T t) {
        T t2;
        if (t == null) {
            return false;
        }
        T[] tArr = this.f328b[m1218e(t)];
        if (tArr == null) {
            return false;
        }
        for (int i = 0; i < tArr.length && (t2 = tArr[i]) != null; i++) {
            if (this.f327a.mo1192E(t2, t)) {
                System.arraycopy(tArr, i + 1, tArr, i, (tArr.length - i) - 1);
                tArr[tArr.length - 1] = null;
                this.f329c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        T[][] tArr;
        int i = 0;
        for (T[] tArr2 : this.f328b) {
            if (tArr2 != null) {
                for (T t : tArr2) {
                    if (t == null) {
                        break;
                    }
                    i = C0052e.m1411h(i, this.f327a.mo1191F(t));
                }
            }
        }
        return C0052e.m1415d(i, this.f329c);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f329c == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C0180b(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m1216g(mo1222a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= m1216g(mo1222a(it.next()));
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        T[][] tArr;
        int i = 0;
        for (T[] tArr2 : this.f328b) {
            if (tArr2 != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < tArr2.length && tArr2[i2] != null) {
                    if (collection.contains(tArr2[i2])) {
                        if (i2 != i3) {
                            tArr2[i3] = tArr2[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    tArr2[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.f329c;
        this.f329c = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f329c;
    }

    @Override // java.util.Set, java.util.Collection
    public final T[] toArray() {
        T[][] tArr;
        T[] mo1220c = mo1220c(this.f329c);
        int i = 0;
        for (T[] tArr2 : this.f328b) {
            if (tArr2 != null) {
                int length = tArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    T t = tArr2[i2];
                    if (t == null) {
                        break;
                    }
                    mo1220c[i] = t;
                    i2++;
                    i++;
                }
            }
        }
        return mo1220c;
    }

    public final String toString() {
        T[][] tArr;
        if (this.f329c == 0) {
            return atm.m897d("1107");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T[] tArr2 : this.f328b) {
            if (tArr2 != null) {
                for (T t : tArr2) {
                    if (t == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(atm.m897d("465A"));
                    }
                    sb.append(t.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final <U> U[] toArray(U[] uArr) {
        T[][] tArr;
        int length = uArr.length;
        int i = this.f329c;
        if (length < i) {
            uArr = (U[]) Arrays.copyOf(uArr, i);
        }
        int i2 = 0;
        for (T[] tArr2 : this.f328b) {
            if (tArr2 != null) {
                int length2 = tArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    T t = tArr2[i3];
                    if (t == null) {
                        break;
                    }
                    uArr[i2] = t;
                    i3++;
                    i2++;
                }
            }
        }
        return uArr;
    }
}
