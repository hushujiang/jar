package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0182d;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.O.f */
/* loaded from: classes.dex */
public class C0137f implements Set<C0129b> {

    /* renamed from: a */
    protected boolean f253a;

    /* renamed from: b */
    public C0135e f254b;

    /* renamed from: c */
    public final ArrayList<C0129b> f255c;

    /* renamed from: d */
    public int f256d;

    /* renamed from: e */
    protected BitSet f257e;

    /* renamed from: f */
    public boolean f258f;

    /* renamed from: g */
    public boolean f259g;

    /* renamed from: h */
    public final boolean f260h;

    /* renamed from: i */
    private int f261i;

    public C0137f() {
        this(true);
    }

    public C0137f(boolean z) {
        this.f253a = false;
        this.f255c = new ArrayList<>(7);
        this.f261i = -1;
        this.f254b = new C0135e(0);
        this.f260h = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/O/b;Lcom/github/catvod/spider/merge/Q/d<Lcom/github/catvod/spider/merge/O/X;Lcom/github/catvod/spider/merge/O/X;Lcom/github/catvod/spider/merge/O/X;>;)Z */
    /* renamed from: a */
    public final void m1261a(C0129b c0129b, C0182d c0182d) {
        if (this.f253a) {
            throw new IllegalStateException(atm.m897d("3E1213066C2B0F0E5A1C3F78181F1B1123360603"));
        }
        if (c0129b.f247e != AbstractC0150l0.f280a) {
            this.f258f = true;
        }
        if (c0129b.m1266b() > 0) {
            this.f259g = true;
        }
        C0129b m1217f = this.f254b.m1217f(c0129b);
        if (m1217f == c0129b) {
            this.f261i = -1;
            this.f255c.add(c0129b);
            return;
        }
        AbstractC0124X m1274g = AbstractC0124X.m1274g(m1217f.f245c, c0129b.f245c, !this.f260h, c0182d);
        m1217f.f246d = Math.max(m1217f.f246d, c0129b.f246d);
        if (c0129b.m1265c()) {
            m1217f.f246d |= 1073741824;
        }
        m1217f.f245c = m1274g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m1261a((C0129b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C0129b> collection) {
        for (C0129b c0129b : collection) {
            m1261a(c0129b, null);
        }
        return false;
    }

    /* renamed from: b */
    public final void m1260b(AbstractC0149l abstractC0149l) {
        if (this.f253a) {
            throw new IllegalStateException(atm.m897d("3E1213066C2B0F0E5A1C3F78181F1B1123360603"));
        }
        if (this.f254b.isEmpty()) {
            return;
        }
        Iterator<C0129b> it = this.f255c.iterator();
        while (it.hasNext()) {
            C0129b next = it.next();
            AbstractC0124X abstractC0124X = next.f245c;
            C0125Y c0125y = abstractC0149l.f279b;
            if (c0125y != null) {
                synchronized (c0125y) {
                    abstractC0124X = AbstractC0124X.m1276b(abstractC0124X, abstractC0149l.f279b, new IdentityHashMap());
                }
            }
            next.f245c = abstractC0124X;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f253a) {
            throw new IllegalStateException(atm.m897d("3E1213066C2B0F0E5A1C3F78181F1B1123360603"));
        }
        this.f255c.clear();
        this.f261i = -1;
        this.f254b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0135e c0135e = this.f254b;
        if (c0135e != null) {
            return c0135e.contains(obj);
        }
        throw new UnsupportedOperationException(atm.m897d("3E1213066C350F0E121A287803095A1B232C4A131705203D071F1401293C4A1C15076C2A0F1B1E1A2234135A0910382B44"));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0137f) {
            C0137f c0137f = (C0137f) obj;
            ArrayList<C0129b> arrayList = this.f255c;
            return arrayList != null && arrayList.equals(c0137f.f255c) && this.f260h == c0137f.f260h && this.f256d == c0137f.f256d && this.f257e == c0137f.f257e && this.f258f == c0137f.f258f && this.f259g == c0137f.f259g;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (this.f253a) {
            if (this.f261i == -1) {
                this.f261i = this.f255c.hashCode();
            }
            return this.f261i;
        }
        return this.f255c.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f255c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<C0129b> iterator() {
        return this.f255c.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f255c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f254b.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f254b.toArray(tArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f255c.toString());
        if (this.f258f) {
            sb.append(atm.m897d("46121B061F3D071B1401253B2915140129201E47"));
            sb.append(this.f258f);
        }
        if (this.f256d != 0) {
            sb.append(atm.m897d("460F141C3D2D0F3B160171"));
            sb.append(this.f256d);
        }
        if (this.f257e != null) {
            sb.append(atm.m897d("4619151B2A3403190E1C223F2B160E0671"));
            sb.append(this.f257e);
        }
        if (this.f259g) {
            sb.append(atm.m897d("461E13053F11040E153A392C0F08391A222C0F020E"));
        }
        return sb.toString();
    }
}
