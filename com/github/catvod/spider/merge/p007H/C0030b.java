package com.github.catvod.spider.merge.p007H;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0049b;
import com.github.catvod.spider.merge.p010K.C0050c;
import com.github.catvod.spider.merge.p010K.C0053f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.H.b */
/* loaded from: classes.dex */
final class C0030b<T> implements Collection<T> {

    /* renamed from: a */
    private final T[] f92a;

    /* renamed from: b */
    private final boolean f93b;

    public C0030b(T[] tArr, boolean z) {
        C0053f.m1406d(tArr, atm.m897d("1C1B1600292B"));
        this.f92a = tArr;
        this.f93b = z;
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        T[] tArr = this.f92a;
        C0053f.m1406d(tArr, atm.m897d("4E0E121C3F7C091514012D310409"));
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (C0053f.m1409a(obj, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C0053f.m1406d(collection, atm.m897d("0F161F1829361E09"));
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f92a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return C0049b.m1421a(this.f92a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(atm.m897d("250A1F072D2C03151455252B4A1415016C2B1F0A0A1A3E2C0F1E5A13232A4A081F1428750514160C6C3B051616102F2C031514"));
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f92a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f92a;
        boolean z = this.f93b;
        C0053f.m1406d(objArr, atm.m897d("4E0E121C3F7C09150A0C18372B08081435170C3B140C"));
        if (!z || !C0053f.m1409a(objArr.getClass(), Object[].class)) {
            objArr = Arrays.copyOf(objArr, objArr.length, Object[].class);
        }
        C0053f.m1407c(objArr, atm.m897d("031C5A5D252B3C1B08143E3F195A5C536C2C0213095B263988FADC550D2A181B03490D361345444F763B061B090662320B0C1B5C"));
        return objArr;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C0050c.m1419b(this, tArr);
    }
}
