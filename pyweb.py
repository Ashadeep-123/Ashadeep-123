import cv2 

cam = cv2.VideoCapture(0)

cv2.namedWindow("Python webcam screenshots")

img_counter = 0

while(True):
        ret,frame = cam.read()

        if not ret:
             print("Failed to grab frame")
             break
         
        cv2.imshow("test",frame)

        k = cv2.waitKey(1)

        if k%256 == 27:
               print("Escape hit, closing the app")
               break
        elif k%256 == 32:
                img_name = "open_cv_frame{}.png".format(img_counter)
                cv2.imwrite(img_name,frame)
                print("Screenshots taken")
                img_counter+=1

cam.release()
cv2.destroyAllWindows()