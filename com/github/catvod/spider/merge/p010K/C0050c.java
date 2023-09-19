package com.github.catvod.spider.merge.p010K;

import com.github.catvod.spider.merge.atm;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.K.c */
/* loaded from: classes.dex */
public final class C0050c {

    /* renamed from: a */
    private static final Object[] f98a = new Object[0];

    /* renamed from: a */
    public static final Object[] m1420a(Collection<?> collection) {
        C0053f.m1406d(collection, atm.m897d("09151619293B1E13151B"));
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        C0053f.m1407c(objArr, atm.m897d("2B080814352B4419150535170C5208103F2D060E5655223D1D29130F2971"));
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        C0053f.m1407c(copyOf, atm.m897d("2B080814352B4419150535170C5208103F2D060E56553F31101F53"));
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f98a;
    }

    /* renamed from: b */
    public static final Object[] m1419b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        C0053f.m1406d(collection, atm.m897d("09151619293B1E13151B"));
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            if (newInstance == null) {
                throw new NullPointerException(atm.m897d("040F16196C3B0B14141A3878081F5A162D2B1E5A0E1A6C360514571B3934065A0E0C3C3D4A111501203104543B073E391346111A38340314543422215544"));
            }
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                C0053f.m1407c(objArr2, atm.m897d("2B080814352B4419150535170C5208103F2D060E5655223D1D29130F2971"));
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                C0053f.m1407c(copyOf, atm.m897d("2B080814352B4419150535170C5208103F2D060E56553F31101F53"));
                return copyOf;
            }
            i = i2;
        }
    }
}
