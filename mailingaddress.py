# Created by Jenny Trac
# Created on Nov 3 2017
# Program formats a mailing address

import ui

def mailing_address(apartment, streetaddress, city, province, postalcode):
    # formats mailing address
    if apartment == " ":
        line1 = str(streetaddress)
    else:
        line1 = str(apartment) + "-" + str(streetaddress)
    line2 = str(city) + " " + str(province) + " " + str(postalcode)
    
    view['line1_label'].text = line1
    view['line2_label'].text = line2


def format_touch_up_inside(sender):
    # button to format
    
    #input
    apartmentinput = str(view['apartment_textfield'].text)
    addressinput = str(view['streetaddress_textfield'].text)
    cityinput = str(view['city_textfield'].text)
    provinceinput = str(view['province_textfield'].text)
    postalcodeinput = str(view['postalcode_textfield'].text)
    
    #process
    mailing_address(apartmentinput, addressinput, cityinput, provinceinput, postalcodeinput)

view = ui.load_view()
view.present('sheet')
